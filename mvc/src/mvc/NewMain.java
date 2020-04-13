/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import controlador.controlador;
import modelo.Modelo;
import vista.vista;

/**
 *
 * @author sergio
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       Modelo modelo= new  Modelo();
       vista ventana = new vista();
       controlador  controlador =new controlador(ventana,modelo);
       ventana.setVisible(true);
       
    }
    
}
