/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package functions;

/**
 *
 * @author Hetarth Patel
 */
public class Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    myfirst();
    myfirst();
    myfirst();
    myfirst();
    myfirst();
    int a=factoorial(5);
    System.out.println(a);
    System.out.println(recursh(5));
        // TODO code application logic here
    }
    
   static void myfirst(){
        System.out.println("Hi");
        System.out.println("hello");
    }
   
    static int factoorial(int num){
        
        int fact =1;
        for(int i=1;i<=num;i++){
        fact= fact*i;
        }
        return fact;
    }
    static int recursh(int n){
        if (n==1){
            return 1;
        }
        else{
        return (n+recursh(n-1));
        }
        
    }
    
}
