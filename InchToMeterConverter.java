import java.util.Scanner;

public class InchToMeterConverter{
  
  public static void main(String [] args){
    
    Scanner sc= new Scanner(System.in);
    
    
    System.out.println("Enter value in inch");
    int value = sc.nextInt();
    System.out.println();
    
    double value_m = value*0.0254;
    System.out.println("Value in meters= "+ value_m+ " m");
  }
}