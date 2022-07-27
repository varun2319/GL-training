package gltesting;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import java.util.*;

class EmployeeTest {

	@Test
	void testFindName() {
		//fail("Not yet implemented");
		ArrayList<String>list=new ArrayList<>();
		list.add("Rohit");
		list.add("Rohan");
		list.add("Rahul");
		Employee e=new Employee();
		System.out.println(list);
		assertEquals("FOUND",e.findName(list, "Rohan"));

	}
}
