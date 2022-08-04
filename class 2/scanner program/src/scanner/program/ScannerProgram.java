/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scanner.program;
import java.util.Scanner;
/**
 *
 * @author Hetarth Patel
 */
public class ScannerProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

 String a;
 int age;
 String b;
 Scanner sc= new Scanner(System.in);
 System.out.println("enter your name:");
 a= sc.nextLine();
 System.out.println("enter your last name:");
 b= sc.nextLine();
 System.out.println("enter your age:");
 age= sc.nextInt();
 System.out.println("your age is:"+age);
 System.out.println("your name is:"+ a + b);
        // TODO code application logic here
    }
    
}
