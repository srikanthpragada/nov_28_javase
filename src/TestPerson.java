
class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name + " is " + age + " years old!";
	}
}

class TestPerson {

	public static void main(String[] args) {
		Person p = new Person("Abc", 30);
		System.out.println(p);
	}
}
