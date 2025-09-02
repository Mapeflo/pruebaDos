/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act1;

import java.util.Scanner;

/**
 *
 * @author marya
 */
public class Act1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double salarioT,salarioN,retencionF,valorH,numeroH;
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Ingrese el valor de la hora trabajada($):");
        valorH= teclado.nextDouble();
        System.out.println("Ingrese el numero de horas trabajadas:");
        numeroH= teclado.nextDouble();
       
       salarioT=valorH*numeroH; 
       retencionF=salarioT*0.05;
       salarioN=salarioT-retencionF;
        
        System.out.println("El salario total del empleado es: $" +salarioT);
        System.out.println("El salario neto del empleado es: $" +salarioN);
        System.out.println("La retencion en la fuente del empleado es: $" +retencionF); 
        
        
    }
    
}
