
import java.util.Scanner;  
  public class seventh {  
       public static void main(String[] args) {    
           Scanner scan = new Scanner(System.in);  
            System.out.print("Enter the number :");  
            int num = scan.nextInt();  
            int digit, reverse = 0;  
           while(num > 0) {  
                 digit = num % 10;  
                reverse = reverse * 10 + digit;  
                num = num / 10;  
            }  
            System.out.println(reverse);  
       }  
  }