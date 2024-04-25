/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mvc_personas;

import Controlador.ControlaPersona;
import Modelo.ModeloPersona;
import Vista.VistaPersona;

/**
 *
 * @author Iván
 */
public class MVC_Personas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        VistaPersona v = new VistaPersona();
        ModeloPersona m = new ModeloPersona();
        
        
        ControlaPersona c = new ControlaPersona(v, m);
        
        c.iniciar();
        
        
    }
    
}
