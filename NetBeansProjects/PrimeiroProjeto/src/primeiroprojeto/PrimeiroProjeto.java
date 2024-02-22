/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primeiroprojeto;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Aluno
 */
public class PrimeiroProjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here       
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Primeiro codigo!" + i);            
        }        
        fun();
    }
    
    public static void fun() {
        
       try {
           Date d = GregorianCalendar.getInstance().getTime();
           SimpleDateFormat format = new SimpleDateFormat();
           System.out.println("*********************");
           System.out.println(format.format(d));
           System.out.println("*********************");
       } catch (Exception e) {
           System.out.println("Ocorreu um erro!");
       }
    }
}