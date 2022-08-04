/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nested.pkgif;
import java.util.Scanner;
/**
 *
 * @author Hetarth Patel
 */
public class NestedIf {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int unit;
    Scanner sc= new Scanner(System.in);
    System.out.println("enter your unit consumed");
    unit = sc.nextInt();
    int bill= ((20*unit)/100)+unit; 
    if (bill<=50){
    System.out.println("amt= "+ bill*0.5);
    
     }
    else if (bill>=50 && bill<100) {
    System.out.println("amt= "+ bill*0.75);
    }
    else if (bill>=100 && bill<250) {
    System.out.println("amt= " + bill*1.2);
    }
    else if (bill>=250) {
    System.out.println("amt =" + bill*1.5);
    }
    else {
    System.out.println("enter a NUMBER");
    }
      // TODO code application logic here
    }
    
}
