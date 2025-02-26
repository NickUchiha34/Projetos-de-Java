/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Jpane;

/**
 *
 * @author douglas_24798
 */
import javax.swing.JOptionPane;

public class Jpane {
    public static void main(String[] args){
        
    JOptionPane.showMessageDialog(null,"Sua soma não é sufilciente");
    
    String nome = JOptionPane.showInputDialog("Qual o seu nome?");
    
    int x=Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
    
    double y=Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
    
    int resposta = JOptionPane.showConfirmDialog(null, "O seu nome é " + nome + "?");
    }  
}
