/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// importamos los paquetes
import modelo.Modelo;
import vista.vista;


/**
 *
 * @author sergio
 */

// implements ActionListener se usa para que pueda escuchar los eventos del boton
public class controlador implements ActionListener {
    
    private vista ventana;
    private Modelo modelo;

    public controlador(vista ventana, Modelo modelo) {
        this.ventana = ventana;
        this.modelo = modelo;
        this.ventana.btnagregar.addActionListener(this);
                }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
         modelo.setNombre(ventana.txtnombre.getText());
        ventana.jTextArea1.setText(ventana.jTextArea1.getText()+"\n"+modelo.getNombre());
        System.out.println(modelo.getNombre());
        
        
        }
    }
    
    

    
  
