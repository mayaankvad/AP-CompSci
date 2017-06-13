package examples;

public class SchoolTester {

	public static void main(String[] args) {

		Person bob = new Person("Coach Bob", 27, "M");

		System.out.println(bob);

		Student lynne = new Student("Lynne Print", 16, "F", "HSS2345", 3.9);
		System.out.println(lynne);

		Teacher mrS = new Teacher("Mister S", 99, "M", "Computer Science", 1000000);
		System.out.println(mrS);

		CollegeStudent ima = new CollegeStudent("Ima Freshman", 18, "F", "RU1234", 4.0, 1, "French");
		System.out.println(ima);

		GradStudent emily = new GradStudent("Emily Jemily", 23, "F", "MIT-000", 3.9, 5, "Bio");

		Student l = lynne;
		Student i = ima;
		Student e = emily;

		e.getMyAge();

		System.out.println(l);
		System.out.println(l.getMyAge() + ": " + l.distinction());

		System.out.println(i);
		System.out.println(i.getMyAge() + ": " + i.distinction());

	}

}

// d ✔
// c ✔
// d ✔
// e ✔
// c ✔
// b ✔
// e ✔
// a
// c
// d
