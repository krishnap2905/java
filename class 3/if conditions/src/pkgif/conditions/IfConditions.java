  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgif.conditions;
import java.util.*;//* means all functions are imported from that file
//Scanner works only import few methods.
public class IfConditions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 int number1;
 int number2;
 int number3;
 Scanner sc= new Scanner(System.in);
 System.out.println("enter your first number");
 number1 = sc.nextInt();
 System.out.println("enter your second number");
 number2 = sc.nextInt();
 System.out.println("enter your third number");
 number3 = sc.nextInt();
if (number1>number2 && number2<number3 ){
System.out.println("number 1 is biggest, then is number 2 and the smallest is number 3");
}
else if (number1>number3 && number2<number3) {
System.out.println("number 1 is biggest, then is number 3 and the smallest is number 2");
}
else if (number2>number1 && number3<number1) {
System.out.println("number 2 is biggest, then is number 1 and the smallest is number 3");
}
else if (number2>number3 && number1<number3) {
System.out.println("number 2 is biggest, then is number 3 and the smallest is number 1");
}
else if (number3>number1 && number2<number1) {
System.out.println("number 3 is biggest, then is number 1 and the smallest is number 2");
}
else if (number3>number2 && number1<number2) {
System.out.println("number 3 is biggest, then is number 2 and the smallest is number 1");
}
else {
System.out.println("please re enter the numbers");
}
// TODO code application logic here
    }
    
}
