import java.util.Scanner;
public class HollowDiamondPattern{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Please enter row number: ");
    int row = sc.nextInt();
    
    for(int row_count=1; row_count<=row; row_count++){
      
      for(int space_count=1; space_count<=row-row_count; space_count++){
        System.out.print(" ");
      }
      
      for(int col_count=1; col_count<=2*row_count-1; col_count++){
        if (col_count == 1 || col_count == 2 * row_count - 1){
          System.out.print(col_count);
        } 
        else{
          System.out.print(" ");
        }
      }
      
      System.out.println();
    }
    
    for(int row_count2=1; row_count2<=row-1; row_count2++ ){
      for(int space_count2=1; space_count2<=row_count2; space_count2++){
        System.out.print(" ");
      }
      for(int col_count2=1; col_count2<= 2 * (row - row_count2) - 1 ; col_count2++){
        if (col_count2 == 1 || col_count2 == 2 * (row - row_count2) - 1){
          System.out.print(col_count2);
        } 
        else{
          System.out.print(" ");}
      }
      System.out.println();
    }
    
  }
}