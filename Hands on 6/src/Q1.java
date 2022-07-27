
import java.util.Scanner;  
  public class Q1 {  
       public static void main(String[] args) {
    	   Scanner scan=new Scanner(System.in);
    	   System.out.println("enter an integer:");
    	   String stringNum =scan.nextLine();
    	   try
    	   {
    		   int intNum= Integer.parseInt(stringNum);
    		   System.out.println("the square is"+ intNum*intNum);
    		   System.out.println("the work has been done successfully");
    		   
    	   }
    	   catch(NumberFormatException e)
    	   {
    		   System.out.println("entered input is not valid format for an integer.");
    	   }
       }
  }


            
