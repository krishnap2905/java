/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgbreak;

/**
 *
 * @author Hetarth Patel
 */
public class Break {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0;i<=10;i++){
        if (i==3){
        System.out.println("i=3 will not get printed");
        continue;
        }
        if (i==5){
        System.out.println("i=5 and beyond wont get printed because of continue");
        break;
        }
        System.out.println(i);
        }
            
        // TODO code application logic here
    }
    
}
