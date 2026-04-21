import java.util.*;
public class NonCommonCharacters{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    
    String str1= sc.next();
    String str2= sc.next();
    String temp= "";
    boolean flag= false;
    
    for(int i=0; i<str1.length(); i++){
      char ch1=str1.charAt(i);
      for(int j=0; j<str2.length(); j++){
        char ch2=str2.charAt(j);
        if(ch1==ch2){
        flag=true;
        }
      }
        if (flag == false){
        temp+=ch1;
        }
        flag = false;
      }//outerloop
    
     for(int i=0; i<str2.length(); i++){
      char ch1=str2.charAt(i);
      for(int j=0; j<str1.length(); j++){
        char ch2=str1.charAt(j);
        if(ch1==ch2){
        flag=true;
        }
      }
        if (flag == false){
        temp+=ch1;
        }
        flag = false;
      }//outerloop
    System.out.println(temp);
    }
}