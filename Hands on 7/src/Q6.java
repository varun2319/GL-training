import java.util.HashSet;
import java.util.Iterator;

public class Q6 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		set.add("Varun");
		set.add("Krishna");
		set.add("Shubham");
		set.add("Dikshit ");
		
		Iterator<String> it = set.iterator();
		while (it.hasNext())
			System.out.println(it.next());

	}

}
