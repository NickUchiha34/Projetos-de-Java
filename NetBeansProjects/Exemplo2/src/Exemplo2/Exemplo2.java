/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exemplo2;

import javax.swing.JOptionPane;

/**
 *
 * @author douglas_24798
 */
public class Exemplo2 {
        public static void main(String[] args){
            int x=Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
            if( x>=10 && x%4==0){
                x+=2;
                JOptionPane.showMessageDialog(null, "Ovalor de x mais 2=" + x);
            }else if( x<10 && x%4 !=0){
                x-=1;
                JOptionPane.showMessageDialog(null, "O valor de x menos 1=" + x);
        }else{
            JOptionPane.showMessageDialog(null, "O valor de x é=" + x);
         }
    }
}
