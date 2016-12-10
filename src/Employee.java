class Employee {
	protected String name;
	protected int salary;
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	public void print() {
		System.out.println(name);
		System.out.println(salary);
	}
	public int getSalary(){
		return salary;
	}
}

class Manager extends Employee {
	protected int hra;
	public Manager(String name, int salary, int hra) {
		super(name,salary);
		this.hra = hra;
	}
	// overriding 
	@Override 
	public void print() {
		super.print();  
		System.out.println(hra);
	}
	public int getSalary(){
		return salary + hra;
	}
}
