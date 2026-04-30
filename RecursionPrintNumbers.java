import java.util.Scanner;
public class RecursionPrintNumbers{
  
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    oneToN(N);
    
  }
  
  public static void oneToN(int a){
    
    
    if(a==0){
      return;
    }
    System.out.print(a+ " ");
    oneToN(a-1);
  }
  
}
