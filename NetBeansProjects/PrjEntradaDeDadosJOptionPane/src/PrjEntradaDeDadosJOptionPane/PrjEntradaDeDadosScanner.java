package PrjEntradaDeDadosJOptionPane;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class PrjEntradaDeDadosScanner {

    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("0.00");        
        String nome = JOptionPane.showInputDialog("Nome: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Altura: "));
        float peso = Float.parseFloat(JOptionPane.showInputDialog("Peso: "));
        
        float imc = peso/(altura * altura);
        
     /* 
    
    public static void normal(double imc) {
        
        if (imc < 18.15) {
             System.out.println("Baixo peso!");            
        }
        
        if ((imc > 18.15) && (imc < 24.9)) {
            System.out.println("Peso norma!");
        }   */   
      JOptionPane.showMessageDialog(null,
              "Nome: " + nome + "\n" +
              "Idade: " + idade + "\n" +
              "Altura: " + altura + "\n" +
              "IMC: " + imc);
    }           
}
