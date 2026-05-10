import java.util.Scanner;
public class HollowTrianglePattern{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Please enter row number: ");
    int row = sc.nextInt();
    
    for(int row_count=1; row_count<=row; row_count++){
      
      for(int space_count=1; space_count<=row-row_count; space_count++){
        System.out.print(" ");
      }
      for(int col_count=1; col_count<=2*row_count-1; col_count++){
        if (col_count == 1 ||col_count == 2 * row_count - 1 || row_count == row) {                       
          System.out.print(col_count);
        } 
        else {
          System.out.print(" ");
        }
        
        
      }
      System.out.println();
    }
  }
}
