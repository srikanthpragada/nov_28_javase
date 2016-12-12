
public class TestEmployee {

	public static void main(String[] args) {
		Manager m = new Manager("Bill", 80000, 30000);
		print(m);
	}
	
	public static void print(Employee e) {
		e.print();  // runtime polymorphism
		double salary = e.getSalary();
		if (salary > 20000)
			System.out.printf("Pay %f by cheque\n", salary);
		else
			System.out.printf("Pay %f by cash\n", salary);
	}

}
