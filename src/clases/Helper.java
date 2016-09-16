/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author llara11
 */
public class Helper {
    public static void mensaje(Component ventana,String mensaje,int tipo){
        switch (tipo){
            case 1:
                JOptionPane.showMessageDialog(ventana, mensaje,"INFORMACION",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2 :
                JOptionPane.showMessageDialog(ventana, mensaje,"ADVERTENCIA!!!!!!!!!!",JOptionPane.WARNING_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(ventana, mensaje,"ERROR!!!!!!!!!!!!",JOptionPane.ERROR_MESSAGE);
                break;
        }
        
        
        
    }
    
}
