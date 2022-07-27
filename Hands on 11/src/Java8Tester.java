
import java.util.Arrays;  
import java.util.List;
import java.util.function.Predicate;

 public class Java8Tester {
	 
 
      public static void evaL(List<Integer> list, Predicate<Integer> pred) {


    	  for (Integer i: list) {
    		   if(pred.test(i)) {
    			   System.out.println(i+" ");
    		   }
    	  }
      }

       public static void main(String[] args) {


           List<Integer> alist = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);


           System.out.println("Print all Numbers: ");
           evaL (alist,(n)->true);
 
           System.out.println();
           System.out.println("Print even Numbers: ");
           evaL (alist, (n)->n%2==0);


           System.out.println(); 
           System.out.println("Print numbers greater than 3:"); 
           evaL (alist, (n)->n>3);
       }
 }
 
       
           

