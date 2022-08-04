/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw.pkg2;
import java.util.*;
/**
 *
 * @author Hetarth Patel
 */
public class Hw2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int input;
    int sum = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter any number to find sum of its digits");
    input = sc.nextInt();
    while (input != 0){
    sum +=input%10;
    input=input/10;
        
    }
    System.out.println(sum);
        // TODO code application logic here
    }
    
}
