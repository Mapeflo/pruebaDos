/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act_9;

import java.util.Scanner;

/**
 *
 * @author marya
 */
public class Act_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int cantidad;
        double precio;
        double total;
        
        
        Scanner teclado=new Scanner (System.in);
        
        System.out.println("Introduzca la cantidad vendida");
        cantidad= teclado.nextInt();
       
        System.out.println("Introduzca el precio");
        precio= teclado.nextDouble();
        
        total=precio*cantidad;
        
        if(cantidad==0) {
            System.out.println("Fin de la lectura");
            
        } else {
            System.out.println("El total de la factura es: "+total);
        }
        
        
    }
    
}
