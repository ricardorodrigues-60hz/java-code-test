package javaapplication1;

import javax.swing.JOptionPane;
public class JavaApplication1 {
    public static void main(String[] args) {
        String nome, sobrenome;
        
        // caixas de entrada
        nome = JOptionPane.showInputDialog("Digite o seu nome:");
        sobrenome = JOptionPane.showInputDialog("Digite o seu sobrenome: ");
        
        // caixa de saída
        JOptionPane.showMessageDialog(null, nome + " " + sobrenome + ",Bem vindo ao sistema");
        
        // Todo input digitado na caixa de entrada do JOptionPane são Strings
        //Convertendo para int e double
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID: "));
        
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("SALDO: "));
        
        
        
        
    }
    
}
