
public class TestEmployee {

	public static void main(String[] args) {
		Employee e = new Employee("Steve", 100000);
		Manager m = new Manager("Bill", 80000, 30000);
		print(e);
		print(m);
	}
	
	public static void print(Employee e) {
		e.print();  // runtime polymorphism
	}

}
