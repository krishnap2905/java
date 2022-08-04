/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homework;

import java.util.Scanner;

/**
 *
 * @author Hetarth Patel
 */
public class Homework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int days;
Scanner sc= new Scanner(System.in);
System.out.println("enter the number of days:");
days = sc.nextInt();
System.out.println("converted to years="+days/365);
System.out.println("converted to months="+days/30);
System.out.println("converted to weeks="+days/7);
// TODO code application logic here
    }
    
}
