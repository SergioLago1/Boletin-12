/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg12;

import static boletin.pkg12.Garaxe.Coches;
import javax.swing.JOptionPane;

/**
 *
 * @author slagogonzalez
 */
public class Boletin12 {

   
    public static void main(String[] args) {
        Garaxe obx= new Garaxe();
        Factura Fac= new Factura();
        int res;
        
        do{
             res = Integer.parseInt(JOptionPane.showInputDialog("¿Sale o entra en el garaje?\nPulsa 1 si quieres entrar\nPulsa 2 si quieres salir.\nSi quieres cerrar el programa pulsa 3."));
        if(res==1){
         obx.plazas();
        }else if (res==2){
            Fac.pedirMatricula();
                JOptionPane.showMessageDialog(null, "El precio es de: " + Fac.precio());
                Fac.dinDevolto();
                JOptionPane.showMessageDialog(null, "" + Fac.toString());
                Coches--; 
         }
        } while (res != 3);

    }
}
