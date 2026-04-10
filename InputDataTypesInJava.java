import java.util.Scanner;

public class InputDataTypesInJava{
  public static void main(String [] args){
    
    //creating scanner object 

    Scanner sc = new Scanner(System.in);
    

    // taking inputs of different datatypes

    System.out.println("Put your Integer input: ");
    int int_input= sc.nextInt();
    System.out.println("Your given Integer input is: "+ int_input);
    
    System.out.println();
    
    System.out.println("Put your String input: ");
    String str_input= sc.next();
    System.out.println("Your given String input is: "+ str_input);
    
    System.out.println();
    
    System.out.println("Put your Boolean input: ");
    Boolean bool_input= sc.nextBoolean();
    System.out.println("Your given Boolean input is: "+ bool_input);
    
    System.out.println();
    
    System.out.println("Put your Double input: ");
    double double_input= sc.nextDouble();
    System.out.println("Your given Double input is: "+ double_input);
    
    
  }
}