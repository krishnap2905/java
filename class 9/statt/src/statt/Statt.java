/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package statt;

/**
 *
 * @author Hetarth Patel
 */
public class Statt {

static int factorial (int num){
    if (num==1){
        return 1;
    }
    else{
        return num * factorial(num-1);
    } 
}

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
    System.out.println(factorial(5));





        // TODO code application logic here
    }
}
    

