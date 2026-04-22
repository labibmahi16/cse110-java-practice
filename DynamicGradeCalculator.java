
import java.util.Scanner;
public class DynamicGradeCalculator{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Grade A mark limit: 100 to ");
    int a_limit = sc.nextInt();
    
    System.out.print("Grade A- mark limit: " + a_limit + " to ");
    int aMinus_limit = sc.nextInt();
    
    System.out.print("Grade B mark limit: " + aMinus_limit + " to ");
    int b_limit = sc.nextInt();
    
    System.out.print("Grade C mark limit: " + b_limit + " to ");
    int c_limit = sc.nextInt();
    
    System.out.print("Grade D mark limit: " + c_limit + " to ");
   int d_limit = sc.nextInt();
    
   System.out.print("What marks have you obtained?");
    int score = sc.nextInt();
    String grade;
    
    
    
    if (score >= a_limit) {grade = "A";}
    else if (score >= aMinus_limit) {grade = "A-" ;}
    else if (score >= b_limit) {grade = "B" ;} 
    else if (score >= c_limit) {grade = "C";} 
    else if (score >= d_limit) {grade = "D";} 
    else { grade = "F"; }
    
    System.out.println("Your grade is " + grade);
    
    sc.close();
    
  }
}     