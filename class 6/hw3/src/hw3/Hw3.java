/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw3;
//Create a function in  which it will print a message age is greater than 18 if the age is greater, else it will print a message age is less than 18 suin g function\
import java.util.Scanner;
/**
 *
 * @author Hetarth Patel
 */
public class Hw3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    boom();
    }
        
   
    static void boom(){
    int age;
    Scanner sc= new Scanner(System.in);
    System.out.println("enter your age");
    age= sc.nextInt();
    if (age>=18){
        System.out.println("your age is greater than 18");
    }
    else {
        System.out.println("your age is under 18");
    }
    
    }
        // TODO code application logic here
    }
    

