// DO NOT MAKE ANY CHANGES TO THIS FILE

// This file will have errors until you flesh out Employee.java

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee1;
		Employee employee2;
		String testName1 = "Smith, Robin";
		String testID1 = "123456789";
		String defaultDepartment = "unknown";
		String testDepartment1 = "IT";
		String testName2 = "Smith, Pat";
		String testID2 = "987654321";
		String testDepartment2 = "Admin";
		int failed = 0;

		// Test constructor that requires only name and ID, omitting GPA
		employee1 = new Employee(testName1, testID1);
		if (!employee1.getName().equals(testName1)) {
			System.out.println("employee1 constructor name expected " + testName1 + " got " + employee1.getName());
			failed++;
		}
		if (!employee1.getEmployeeID().equals(testID1)) {
			System.out.println("employee1 constructor ID expected " + testID1 + " got " + employee1.getEmployeeID());
			failed++;
		}
		if (!employee1.getDepartment().equals(defaultDepartment)) {
			System.out.println("employee1 constructor department expected " + defaultDepartment + " got " + employee1.getDepartment());
			failed++;
			
		}
		
		employee2 = new Employee(testName1, testID1, testDepartment1);
		if (!employee2.getName().equals(testName1)) {
			System.out.println("employee2 constructor name expected " + testName1 + " got " + employee2.getName());
			failed++;
		}
		if (!employee2.getEmployeeID().equals(testID1)) {
			System.out.println("employee2 constructor ID expected " + testID1 + " got " + employee2.getEmployeeID());
			failed++;
		}
		if (!employee2.getDepartment().equals(testDepartment1)) {
			System.out.println(
					"employee2 constructor department expected " + testDepartment1 + " got " + employee2.getDepartment());
			failed++;
		}

		employee2.setName(testName2);
		if (!employee2.getName().equals(testName2)) {
			System.out.println("employee2 setName expected " + testName2 + " got " + employee2.getName());
			failed++;
		}

		employee2.setEmployeeID(testID2);
		if (!employee2.getEmployeeID().equals(testID2)) {
			System.out.println("employee2 setName expected " + testID2 + " got " + employee2.getEmployeeID());
			failed++;
		}

		employee2.setDepartment(testDepartment2);
		if (!employee2.getDepartment().equals(testDepartment2)) {
			System.out.println(
					"employee2 setDepartment expected " + testDepartment2 + " got " + employee2.getDepartment());
			failed++;
		}

		System.out.println("Object toString returns " + employee2);

		System.out.println(failed + " tests failed");
	}
}