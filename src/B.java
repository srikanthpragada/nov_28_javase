
class A {
	static {
		System.out.println("Static Init A");
	}
	{
		System.out.println("Init A");
	}

}

class B extends A {
	static {
		System.out.println("Static Init B");
	}

	{
		System.out.println("Init B");
	}

	public static void main(String args[]) {
		B obj = new B();
	}
}
