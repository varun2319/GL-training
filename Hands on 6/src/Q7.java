import java.util.ArrayList;
 
public class Q7 {
 
  public static void main(String[] args) {
    ////Creating object of ArrayList
    ArrayList arrList = new ArrayList();
   
    //adding data to the list
    arrList.add("January");
    arrList.add("February");
    arrList.add("March");
    arrList.add("April");
    arrList.add("May");
    arrList.add("June");
    arrList.add("July");
    arrList.add("August");
    arrList.add("September");
    arrList.add("October");
    arrList.add("November");
    arrList.add("December");
   
    System.out.println("Array List elements: ");
    for(int iLoop=0; iLoop < arrList.size(); iLoop++)
      System.out.println(arrList.get(iLoop));
   
  }
}