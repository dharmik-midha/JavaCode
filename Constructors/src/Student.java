import java.io.*;

class Student {
	String name;
	String course;
	int age;

	Student() {
		name = "unknown";
		course = "unknown";
		age = 0;
		System.out.println("name is " + name + " ,age is " + age + " and cousre is " + course);
	}

	Student(String n1, String c1, int a1) {
		name = n1;
		course = c1;
		age = a1;
		System.out.println("name is " + name + " ,age is " + age + " and cousre is " + course);
	}

	Student(String n2) {
		name = n2;
		course = "MCA";
		age = 21;
		System.out.println("name is " + name + " ,age is " + age + " and cousre is " + course);
	}

	public static void main(String arg[]) {
		Student s = new Student();
		Student s1 = new Student("rajesh", "MCA", 22);
		Student s2 = new Student("shyamlal");
	}
}
