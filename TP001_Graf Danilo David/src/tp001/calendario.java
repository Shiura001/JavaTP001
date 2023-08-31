/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package tp001;

import java.util.Scanner;

public class calendario {
    
     public boolean isDiaSemana(String day) {
         String[] dias={"domingo","lunes","martes","miercoles","jueves","viernes","sabado"};
         day = day.toLowerCase();
         
         for (String i : dias) {
             if (day.equals(i)) {
                 System.out.println("Es válido");
                 return true;
             }
         }
         System.out.println("No válido");
         return false;
         
    } 
    
}
