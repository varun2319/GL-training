import java.util.Scanner;

public class String3{
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        String next="";
        System.out.println("Enter the string");       
        String abc= sc.nextLine();
        int length =abc.length();
        if(length<=1){
            next=abc;
           
        }
        else{
            for (int i=0;i<length;i++){
                next=next+abc.charAt(0)+abc.charAt(1);
            }
        }
        System.out.print(next);
    sc.close();
    }
}