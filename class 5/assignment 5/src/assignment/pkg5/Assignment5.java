/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment.pkg5;
import java.util.Scanner;  

/**
 *
 * @author Hetarth Patel
 */
public class Assignment5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    int input;
    int i, prime;
    Scanner sc= new Scanner(System.in);
    System.out.println("enter any number");
    input= sc.nextInt();
    prime = 1;
    for (i=2; i<=input/2;i++){
    if (input%i==0){
    prime=0;
    break;
    }
    }
    if (prime==1&&input>1){
    System.out.println(input+"is prime number");
    }
        // TODO code application logic here
    }
    
}
