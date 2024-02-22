package prjentradadedadosscanner;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PrjEntradaDeDadosScanner {

    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("0.00");        
        Scanner entrada = new Scanner(System.in);        
        System.out.println("Entrada de dados");
        System.out.print("Nome.....: ");
        String nome = entrada.next();
        System.out.print("Idade......: ");
        byte idade = entrada.nextByte();     
        System.out.print("Peso...: ");
        int peso = entrada.nextInt(); 
        System.out.print("Altura...: ");        
        float altura = entrada.nextFloat(); 
        double imc = peso/(altura * altura);
        
        System.out.println("**** Dados informados ****");        
        System.out.println("Nome...: " + nome);
        System.out.println("Idade...: " + idade);
        System.out.println("Altura...: " + df.format(altura));
        System.out.println("Peso...: " + peso);
        System.out.println("IMC...: " + imc);
    }    
    
    public static void normal(double imc) {
        
        if (imc < 18.15) {
             System.out.println("Baixo peso!");            
        }
        
        if ((imc > 18.15) && (imc < 24.9)) {
            System.out.println("Peso norma!");
        }                
    }           
}
