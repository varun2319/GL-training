import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a word with a integer");
		String w=sc.nextLine();
		String []s=w.split(",");
		String s1=s[0];
		int k=Integer.parseInt(s[1]);
		w=s1.substring(k-1);
		for(int i=0;i<k;i++)
		{
			System.out.print(w);
		}
		

	}

}
