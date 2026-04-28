
import java.util.Scanner;
public class DivisibilityChecker{
  public static void main(String [] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a number: ");
 int number = sc.nextInt(); 
 
 System.out.println("Enter first divisor: ");
 int first_div = sc.nextInt(); 
 
 System.out.println("Enter second divisor: ");
 int second_div = sc.nextInt(); 
 
 
 if(number%first_div==0 && number%second_div==0){
 System.out.println(" Divisible by both");}
 else if(number%first_div==0 && number%second_div!=0){
 System.out.println(" Divisible by " + first_div+ " only");}
else if(number%first_div!=0 && number%second_div==0){
 System.out.println(" Divisible by "+ second_div +" only");}
else{System.out.println(" Divisible by none!");}
  }
}