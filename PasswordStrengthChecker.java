import java.util.Scanner;
public class PasswordStrengthChecker{
  public static void main(String [] args){
    
    System.out.println("Strong password requirements: ");
    System.out.println("Password must be at least 8 characters long ");
    System.out.println("The password should contain at least 1 Uppercase letter ");
    System.out.println("The password should contain at least 1 Lowercase letter");
    System.out.println("The password should contain at least 1 Digit ");
    System.out.println("The password should contain at least 1 Special Character ");
    
    
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter your password: ");
    String password = sc.nextLine();
    
    boolean hasUpper= false, hasLower=false , hasDigit=false , hasSpecial=false;
    
    if(password.length()>=8){
      
      for(int i=0;i<password.length();i++){
        
        
        char ch=password.charAt(i);
        
        if(ch>='A'&&ch<='Z') 
          hasUpper=true;
        
        else if(ch>='a'&&ch<='z') 
          hasLower=true;
        
        else if(ch>='0'&&ch<='9') 
          hasDigit=true;
        
        else if(ch!=' ') 
          hasSpecial=true;
      }
    }
    
    
    if(password.length()>=8 && hasUpper && hasLower && hasDigit && hasSpecial){ 
      System.out.println("Strong Password");
    }
    else {
      System.out.println("Weak Password");
    }
  }
}