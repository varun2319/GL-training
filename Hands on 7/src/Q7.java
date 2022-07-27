
import java.util.Iterator;
import java.util.TreeSet;

public class Q7 {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		//Collection<String> set = new TreeSet<>(Collections.reverseOrder());
		set.add("Varun");
		set.add("Krishna");
		set.add("Shubham");
		set.add("Dikshit");
		
		Iterator<String> it = set.iterator();
		String query = "mannu";
		boolean result = false;
		
		while (it.hasNext()) {
			if (it.next().equals(query)) {
				result = true;
				break;
			}
		}
		
		if (result) System.out.println(query + " exists");
		else System.out.println(query + " doesn't exist");

	}

}
