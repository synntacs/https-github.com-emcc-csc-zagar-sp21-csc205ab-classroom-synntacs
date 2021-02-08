// DO NOT MAKE ANY CHANGES TO THIS FILE

public class StudentTest {
	public static void main(String[] args) {
		Student student1;
		Student student2;
		String testName1 = "Smith, Robin";
		String testID1 = "123456789";
		double defaultGpa = 0;
		double testGpa1 = 3.5;
		String testName2 = "Smith, Pat";
		String testID2 = "987654321";
		double testGpa2 = 4.0;
		int failed = 0;

		// Test constructor that requires only name and ID, omitting GPA
		student1 = new Student(testName1, testID1);
		if (!student1.getName().equals(testName1)) {
			System.out.println("student1 constructor name expected " + testName1 + " got " + student1.getName());
			failed++;
		}
		if (!student1.getStudentID().equals(testID1)) {
			System.out.println("student1 constructor ID expected " + testID1 + " got " + student1.getStudentID());
			failed++;
		}
		if (student1.getGpa() != defaultGpa) {
			System.out.println("student1 constructor GPA expected " + defaultGpa + " got " + student1.getGpa());
			failed++;
		}
		
		// Test constructor that requires name, ID and GPA
		student2 = new Student(testName1, testID1, testGpa1);
		if (!student2.getName().equals(testName1)) {
			System.out.println("student2 constructor name expected " + testName1 + " got " + student2.getName());
			failed++;
		}
		if (!student2.getStudentID().equals(testID1)) {
			System.out.println("student2 constructor ID expected " + testID1 + " got " + student2.getStudentID());
			failed++;
		}
		if (student2.getGpa() != testGpa1) {
			System.out.println("student2 constructor GPA expected " + testGpa1 + " got " + student2.getGpa());
			failed++;
		}

		// Test setters and getters
		student2.setName(testName2);
		if (!student2.getName().equals(testName2)) {
			System.out.println("student2 setName expected " + testName2 + " got " + student2.getName());
			failed++;
		}

		student2.setStudentID(testID2);
		if (!student2.getStudentID().equals(testID2)) {
			System.out.println("student2 setName expected " + testID2 + " got " + student2.getStudentID());
			failed++;
		}

		student2.setGpa(testGpa2);
		if (student2.getGpa() != testGpa2) {
			System.out.println("student2 setGpa expected " + testGpa2 + " got " + student2.getGpa());
			failed++;
		}

		System.out.println("Object toString returns " + student2);

		System.out.println(failed + " tests failed");
	}
}