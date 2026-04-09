import java.util.*;
public class FibonacciWithLimitCheck{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    
    
    int first_num= 0;
    int sec_num= 1;
    int sum=0;
    int lastPrinted = 0;
      
      System.out.print("Enter limit: ");
    int limit = sc.nextInt(); 
    
    System.out.print(first_num+ ", ");
    lastPrinted = first_num;
    
    if (sec_num<=limit) {
      System.out.print(sec_num +", ");
      lastPrinted = sec_num;
    }
    
    for (int i=0; ; i++) {  
      
      sum = first_num+sec_num;
      
      if (sum>limit) {
        break;   
      }
      
      
      System.out.print(sum+ ", ");
      lastPrinted = sum;
      
      first_num=sec_num;
      sec_num=sum;
      
    }
    
    System.out.println();
    
    if (lastPrinted == limit) {
      System.out.println(limit + " is a Fibonacci number");
    }
    else {
      System.out.println(limit + " is not a Fibonacci number");
      System.out.println("Nearest previous Fibonacci number is: " + lastPrinted);
    }
    
    
  }
}