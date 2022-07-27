
import java.util.Iterator;
import java.util.Vector;

class Employee {
	private int id;
	private String name;
	private String address;
	private Double salary;
	
	public Employee(int id, String name, String address, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}	
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
}

public class Q4 {

	public static void main(String[] args) {
		Vector<Employee> list = new Vector<>();
		
		list.add(new Employee(1, "Varun", "bihar, India", 20000.0));
		list.add(new Employee(2, "Krishna", "bihar, India", 30000.0));
		list.add(new Employee(3, "Shubham", "bihar, India", 35000.0));
		list.add(new Employee(4, "Dikshit", "bihar, India", 40000.0));
		
		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) 
			System.out.println(it.next());
		

	}

}