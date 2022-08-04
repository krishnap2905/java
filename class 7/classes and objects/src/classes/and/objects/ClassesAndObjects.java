/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classes.and.objects;

/**
 *
 * @author Hetarth Patel
 */
public class ClassesAndObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        Rectangle rectangle1= new Rectangle();
        rectangle1.insert(5, 10);
        System.out.println(rectangle1.length);
        System.out.println(rectangle1.width);
        rectangle1.area();
    }
    
}



class Rectangle {
    int length;
    int width;
    int ar;
  void insert(int a,int b){
     length =a;
     width=b;
  } 
    void area(){
    ar= length * width;
    System.out.println("the area is- " +ar);
    }

  
    
}
