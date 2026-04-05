import java.util.Scanner;

public class circleAreaWithRadius{
  
  public static void main(String [] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Please enter radius of a circle");
    
    int radius =sc.nextInt();
    
    double area=Math.PI* radius*radius;
    
    System.out.printf("Area of the circle is = %.4f\n", area);
    
    sc.close();
    
  }
  
  
}