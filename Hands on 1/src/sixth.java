import java.util.Scanner;
public class sixth {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char c=s.next().charAt(0);
		int i;
		
		if(c>='a'&&c<='z') {
		System.out.println(c+"->");
		i=(int)c;
		c=(char)(i-32);
		System.out.println(c);
		}
		
		else {
			System.out.println(c+"->");
		    i=(int)c;
			c=(char)(i+32);
			System.out.println(c);
		}
	}
}