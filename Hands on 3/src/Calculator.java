public class Calculator {  
       public static int powerInt(int num1, int num2) {  
            return (int) Math.pow(num1, num2);  
       }  
       public static double powerDouble(double num1, int num2) {  
            return Math.pow(num1, num2);  
       }  
       public static void main(String[] args) {   
            System.out.println(powerInt(14, 2));  
            System.out.println(powerDouble(3.5, 3));  
       }  
  }