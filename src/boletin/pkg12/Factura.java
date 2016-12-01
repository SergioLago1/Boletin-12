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
public class Factura {
    
    String mat;
    float pre, tiempo, cartosRecibidos, cartosDevoltos; 
    
        
    public String pedirMatricula(){
        Garaxe obx = new Garaxe();
        mat = obx.matricula();
        return mat;
    }
    public float tiempo(){
       return tiempo = Float.parseFloat(JOptionPane.showInputDialog("Introduzca el tiempo"));
    }
   
    public float precio(){
       float tiemp= tiempo; 
       if (tiemp <= 3){
           pre=1.5f;
       }else{
           float tiemp2 = (tiemp-3);
            pre = (float) (+1.5 + (0.2 * tiemp2));
       }
       return pre;
    }
    public float dinRecibido(){
        return cartosRecibidos= Float.parseFloat(JOptionPane.showInputDialog("Introduzca el dinero recibido"));
    }
    public float dinDevolto(){
       float dinero= dinRecibido();
       cartosDevoltos = dinero - pre;
       return cartosDevoltos;
    }

    @Override
    public String toString() {
        return "Factura:" + "\nMatricula=" + mat + "\nTiempo=" + tiempo + "horas" + "\nPrecio=" + pre + "€" + "\nCartos recibidos=" + cartosRecibidos + "€" + "\nCartos devoltos=" + cartosDevoltos + "€";
    }
    
}
