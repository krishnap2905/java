/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructors;

/**
 *
 * @author Hetarth Patel
 */
public class Constructors {
    int id;
    String name;
    int age;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Constructors obj1 = new Constructors();
    Constructors obj2 = new Constructors(16);
    Constructors obj3 = new Constructors(111,"krishna");
     obj2.display();
    obj3.display();
// TODO code application logic here
    }
    Constructors(){
    System.out.println("this is a default constructor");
    }
    Constructors(int i){
    age= i;
    }
    
    Constructors(int a,String b){
    id= a;
    name= b;
    }
    void display(){
        System.out.println(id + " " + name);
        System.out.println(age);
    }
}
    
    
