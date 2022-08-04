/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance;

/**
 *
 * @author Hetarth Patel
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    animal obj1= new animal ();
    dog obj2= new dog ();
    labrador obj3 = new labrador ();
    obj1.eat();
    obj1.name();
    obj2.display();
    obj3.main();
        // TODO code application logic here
    }
    
}
class labrador {
void main(){
    System.out.println("main class");
}  
}

class animal extends labrador {
void name (){
System.out.println("this is super class");
}
void eat (){
System.out.println("poop");
}
}
class dog extends labrador {
void display (){
System.out.println("this is sub class");
}
}   
