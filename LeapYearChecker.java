import java.util.Scanner;
public class LeapYearChecker{
  public static void main(String [] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println(" Enter year");
    int year = sc.nextInt();
    
    boolean leap_year = (year%4==0 && year%100!=0)||(year%400==0);
    
    if (leap_year){
      System.out.println(year+ " is a leap year");
    }
    
    else{
      System.out.println(year+ " is not a leap year");
    }
  }
}