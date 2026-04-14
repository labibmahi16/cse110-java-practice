import java.util. Scanner;

public class SumUpToLimit{
  public static void main(String [] args){
    
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter limit: ");
    int lim = sc.nextInt(); 
    
    int sum=0;
    
    for(int i= 0; i<=lim; i++){
      sum=sum+i; 
    }
    System.out.println(sum);
  }
}