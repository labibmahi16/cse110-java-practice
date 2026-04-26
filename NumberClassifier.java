import java.util.Scanner;
public class NumberClassifier{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: .");
    int number = sc.nextInt(); 
    if(number<0){
      System.out.println(" Number is negative");}
    else if(number==0){
      System.out.println(" Number is zero");}
    else{
      if(number>0 && number%2==0){
        System.out.println(" Number is positive and even");}
      else{
        System.out.println(" Number is positive and odd");}
      
    }
    
  }
}