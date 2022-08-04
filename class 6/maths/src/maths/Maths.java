/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maths;
import java.util.*;
/**
 *
 * @author Hetarth Patel
 */
public class Maths {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int shape;
        Scanner sc= new Scanner(System.in);
        System.out.println("choose from the following numbers: ");
        System.out.println("1. area of right traingle");
        System.out.println("2. area of equilateral triangle");
        System.out.println("3. area of square");
        System.out.println("4. area of rectangle");
        System.out.println("5. area of circle");
        System.out.println("6. EXIT");
        shape = sc.nextInt();
        switch(shape){
            case 1:
                System.out.println("enter base");
                int base = sc.nextInt();
                System.out.println("enter height");
                int height = sc.nextInt();
                int area = (base*height)/2;
                System.out.println("the area of the right angled triangle is " + area);
                break;
                         
            case 2:
                System.out.println("enter side");
                int side = sc.nextInt();
                float area2 = (float)((1.732*side*side)/4); 
                System.out.println("the area of the equilateral triangle is " + area2);
                break;
            
            case 3:
                System.out.println("enter side");
                int side2 = sc.nextInt();
                int area3 = side2*side2;
                System.out.println("the area of the square is " + area3);
                break;
                
            case 4:
                System.out.println("enter length");
                int length = sc.nextInt();
                System.out.println("enter breadth");
                int breadth = sc.nextInt();
                int area4 = length*breadth; 
                System.out.println("the area of the rectangle is " + area4);
                break;
                
            case 5:
                System.out.println("enter radius");
                int radius = sc.nextInt();
                int area5 = (22*radius*radius)/7;
                System.out.println("the area of the circle is " + area5);
                break;
            
            case 6:
                System.out.println("please run the program again");
                break;
            
            default:
                System.out.println("enter in numbers please");
                
        }
        
        // TODO code application logic here
    }   
    
}
