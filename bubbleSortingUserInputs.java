import java.util.*;

public class bubbleSortingUserInputs {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Please input how many numbers you want to take: ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    
    //array input
    System.out.println("Please enter the numbers: ");
    for (int i=0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    
    //what does the user want
    String want;
    while (true) {
      System.out.print("Ascending or Descending: ");
      want = sc.next();
      
      if (want.equalsIgnoreCase("ascending") || want.equalsIgnoreCase("descending")) {
        break;
      } else {
        System.out.println("Invalid input! Please try again");
      }
    }
    
    // bubblesortPart
    for (int i=0; i < arr.length-1; i++) {
      for (int j=0; j < arr.length-1-i; j++) {
        
        if (
            (want.equalsIgnoreCase("ascending") && arr[j] > arr[j + 1]) ||
            (want.equalsIgnoreCase("descending") && arr[j] < arr[j + 1])
           ) {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
    
    //Output
    System.out.println();
    
    if (want.equalsIgnoreCase("ascending")) {
      System.out.println("Ascending values:");
    } else {
      System.out.println("Descending values:");
    }
    
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}