import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class Q2 {

	public static void main(String[] args) {
		Properties properties = new Properties();
		
		properties.setProperty("Bihar", "Patna");
		properties.setProperty("Karnataka", "Bengaluru");
		properties.setProperty("UP", "Luckhnow");

		Set<Entry<Object, Object>> set = properties.entrySet();
		Iterator<Entry<Object, Object>> itr = set.iterator();
		
		while (itr.hasNext()) {
			Entry<Object, Object> e = itr.next();
			System.out.println(e);
		}
	}

}
