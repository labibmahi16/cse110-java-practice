
import java.util.Scanner;
public class NumberEqualityChecker{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in); 
    System.out.println("Please enter first number");
    int first_number = sc.nextInt();
    System.out.println("Please enter second number");
    int second_number = sc.nextInt();
    System.out.println("Please enter third number");
    int third_number = sc.nextInt();
    
    if (first_number == second_number && second_number == third_number) 
    {System.out.println("All numbers are equal");}
    else if (first_number != second_number && second_number != third_number && first_number != third_number) 
    {System.out.println("All numbers are different");} 
    else {System.out.println("Neither all are equal nor different");}
    
    sc.close();
  }
}