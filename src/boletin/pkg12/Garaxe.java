/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg12;

import javax.swing.JOptionPane;

/**
 *
 * @author slagogonzalez
 */
public class Garaxe {
    public static int Coches=0;
    String matricula;
    public static int getCoches(){
        return Coches;
    }
    public void plazas(){
    
           if (Coches<5){
               JOptionPane.showMessageDialog(null, "Hay plazas disponibles");
               matricula();
               Coches++;
            } else {
            JOptionPane.showMessageDialog(null, "Completo");
        }
    }
    public String matricula(){
        return matricula = JOptionPane.showInputDialog("Introduzca la matricula del coche");
    }
}
