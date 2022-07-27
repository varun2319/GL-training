
import java.util.*;
public class Ten
{
 public static void main(String arg[]){
 int size;
 System.out.println("Enter the Size or Array");
 Scanner sc= new Scanner(System.in);
 size=sc.nextInt();
 int array[]=new int[size];// you can define double array too
 int sum=0;
  for(int i=0;i<array.length;i++)
 {
/* 
This logic is used  for calculating sum of array elements*/
  array[i]=sc.nextInt();
  sum=sum + array[i];
}
  System.out.println("Sum of Array Elements are:"+sum);
  double average=(sum/array.length);//simple average formula
  System.out.format("Average of Array Elements is" +average);
}
}