/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author Yefer
 */
public class Validar {
    /*
    Se crea el método validar letras que consiste en capturar las teclas según se 
    pulsan y decidir si se aceptan o no para escribir en el JTextField
    */
    public void validarLetras(JTextField campo){
        campo.addKeyListener(new KeyAdapter(){
            //Cada vez que se pulse una tecla, se avisará al método keyTyped(KeyEvent e) de nuestro KeyListener.
            public void keyTyped(KeyEvent e){
                //Del KeyEvent que nos pasan como parámetro podemos obtener qué tecla se ha pulsado (qué caracter) y rechazarla o no según convenga
                char c = e.getKeyChar();
                
                if(Character.isDigit(c)){
                    e.consume();
                    System.out.println("Ingrese solo letras");
                }
            }
        });
    }
}
