import java.util.Scanner;
public class ArrayStatistics{
  public static void main(String [] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("How many numbers you want to take: ");
    int n = sc.nextInt();
    
    double [] arr = new double[n];
    
    System.out.println("Enter the numbers: ");
    for(int i=0; i<arr.length; i++){
      arr[i] = sc.nextDouble();
    }
    
    double max= arr[0];
    
    double min= arr[0];
    
    int maxInd= 0;
    
    int minInd=0;
    
    double sum=0;
    
    double average;
    int len= arr.length;
    
    for(int i=0; i<len; i++){
      if(arr[i]>max){
        max= arr[i];
        maxInd=i;
      }
      else if (arr[i]<min){
        min = arr[i];
        minInd=i;
      }
      sum= sum+arr[i];
    }
    
    
    average= sum/len;
    
    
    System.out.println("Maximum element: " +max);
    
    System.out.println("Minimum element: " + min );
    
    System.out.println("Summation: " +sum);
    
    System.out.println("Average: " + average);
  }
}

