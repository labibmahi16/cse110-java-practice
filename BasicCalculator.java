import java.util.*;

public class BasicCalculator {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    
    System.out.println("====Welcome to Calculator====");
    
    while(true){
      System.out.println();
      System.out.println("Choose an operation:");
      System.out.println("Addition");
      System.out.println("Subtraction");
      System.out.println("Multiplication");
      System.out.println("Division");
      System.out.println("Modulus");
      System.out.println("Power");
      System.out.println();
      
      // while(true){
      
      System.out.print("What operation do you want? ");
      String choice = sc.next();
      
      System.out.print("Enter first number: ");
      double num1 = sc.nextDouble();
      
      System.out.print("Enter second number: ");
      double num2 = sc.nextDouble();
      
      double result = 0;
      
      if (choice.equalsIgnoreCase("Addition")) {
        result = num1 + num2;
      } 
      else if (choice.equalsIgnoreCase("Subtraction")) {
        result = num1 - num2;
      } 
      else if (choice.equalsIgnoreCase("Multiplication")) {
        result = num1 * num2;
      } 
      else if (choice.equalsIgnoreCase("Division")) {
        
        if (num2 == 0) {
          System.out.println("Error! Division by zero is not allowed.");
          continue;
        }
        result = num1 / num2;
      } 
      else if (choice.equalsIgnoreCase("Modulus")) {
        result = num1 % num2;
      } 
      else if (choice.equalsIgnoreCase("Power")) {
        result = Math.pow(num1, num2);
      }
      
      System.out.println("Result: " + result);
      
      System.out.print("Continue calculation? (yes/no): ");
      String ask = sc.next();
      
      if (ask.equalsIgnoreCase("no")) {
        System.out.println("Thanks for calculating!");
        break;
      }
      else if (!ask.equalsIgnoreCase("yes")) {
        System.out.println("Invalid input");
         
      }
      
      //}
      
      
    }
    System.out.println();
    
    System.out.println("Thank you for using the calculator!");
  }
}