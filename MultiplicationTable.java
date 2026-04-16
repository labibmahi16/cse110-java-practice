import java.util.Scanner;
public class  MultiplicationTable{
  public static void main(String [] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter a number for it's multiplication table (up to 10): ");
    int n= sc.nextInt();
    for(int i=1; i<=10; i++){
      System.out.println(n+ " x "+i +" = "+ n*i);}
  }
}