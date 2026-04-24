
import java.util.Scanner;
public class TriangleTypeChecker{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in); 
    System.out.print("Enter first side of the triangle: ");
    int a = sc.nextInt();
    System.out.print("Enter second side of the triangle: ");
    int b = sc.nextInt();
    System.out.print("Enter third side of the triangle: ");
    int c = sc.nextInt();
    
    if (a == b && b == c) 
    { System.out.println("This is an Equilateral triangle");}
    
    else if (a == b || b == c || a == c) 
    {System.out.println("This is an Isosceles triangle");}
    
    else { System.out.println("This is a Scalene triangle");}
    
    
    sc.close();
  }
} 