import java.util.Scanner;
public class PairSumFinder{
  public static void main(String [] args){
    Scanner sc= new Scanner(System.in);
    
    System.out.println("How many values you want to take: ");
    int size = sc.nextInt();
    int [] arr = new int[size];
    
    System.out.println("Enter the values:");
    for(int idx=0; idx<size; idx++){
    
      arr[idx]=sc.nextInt();
      
    }
    
    System.out.println("Please enter the target value");
    int target= sc.nextInt();
    int counter=0; 
    
    for(int i=0; i<size; i++){
    
      for(int j = i+1; j<size; j++){
      int sum = arr[i]+ arr[j];
      if (sum ==target){
      System.out.println("To get "+ target +" add " +arr[i]+ " & " +arr[j]) ;
      counter++;
        break;
      }
    }
      if(counter==1){
      break;
      }
  }
    if(counter==0){
    System.out.println("Target not found");}
  }
}