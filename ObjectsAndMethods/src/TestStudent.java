
public class TestStudent {
	public static void main(String[] args) {

		Student def = new Student();
		System.out.println(def + "\n");

		Student s = new Student("May Vad", "327200");

		System.out.println(s);
		s.addCerdits(10);
		System.out.println(s);
		s.setName("NEW NAME");
		System.out.println(s);

	}
}