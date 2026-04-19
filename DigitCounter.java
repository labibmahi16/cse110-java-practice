import java.util.Scanner;
 public class DigitCounter{
   public static void main(String [] args){
     Scanner sc= new Scanner(System.in);
     int number= sc.nextInt();
     int count=0;
     int remainder=0;
     for(count=1; count<number; count++){
     remainder = number%10;
     number=number/10;}
     System.out.println("Total digits of the number: ");
     System.out.println(count);
   }
 }
    