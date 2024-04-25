/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ModeloPersona;
import Vista.VistaPersona;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Iván
 */
public class ControlaPersona implements ActionListener{
    
    private VistaPersona v;
    private ModeloPersona m;

    public ControlaPersona(VistaPersona v, ModeloPersona m) {
        this.v = v;
        this.m = m;
        this.v.btnAgregar.addActionListener(this);
    }
    
    public void iniciar(){
        v.setVisible(true);
        v.setTitle("Gestión de personas");
        v.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == v.btnAgregar){
            String nombre = v.campoNombre.getText();
            String apellidos = v.campoApellido.getText();
            int edad = Integer.parseInt(v.campoEdad.getText() );
            
            m = new ModeloPersona(nombre, apellidos, edad);
            
            DefaultTableModel tabla = (DefaultTableModel) v.jTable1.getModel();
            
            tabla.addRow(new Object[]{m.getNombre(), m.getApellido(), m.getEdad()});
        }
    }
}
