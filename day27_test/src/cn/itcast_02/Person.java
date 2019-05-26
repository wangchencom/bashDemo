package cn.itcast_02;


public class Person {
	private String name;
	public int age;

	public Person() {
	}

	Person(String name) {
		this.name = name;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void show() {
		System.out.println("show");
	}

	public void function(String s) {
		System.out.println("function:" + s);
	}

	public String reutrnValue(String name, int age) {
		return "hello " + name + "***" + age;
	}

	private void hello() {
		System.out.println("helloworld");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
