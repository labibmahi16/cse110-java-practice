import java.util.*;
public class SubstringOccurrenceCounter{
  public static void main(String [] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter your line");
    String str1 = sc.nextLine();
    
    System.out.println("Enter any word to see how many times it's used: ");
    String str2 = sc.next();
    
    int times=0;
    
    for(int i=0; i<str1.length(); i++){
      char ch = str1.charAt(i);
      if(ch==str2.charAt(0)){
        Boolean flag= true;
        int index=i;
        for(int j=0; j<str2.length();j++){
          char ch1=str1.charAt(index);
          char ch2=str2.charAt(j);
          
          if(ch1!=ch2){
            flag=false;
            break;
          }
          index++;
        }//small loop
        if(flag==true){
          times++;
        }
      }//if ends
    }//big loop
    
    System.out.println(times);
  }
}