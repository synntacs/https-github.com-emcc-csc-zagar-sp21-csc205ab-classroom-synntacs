// DO NOT MAKE ANY CHANGES TO THIS FILE

public class Student extends Person {
	private String studentID;
	private double gpa;

	public Student(String name, String studentID) {
		// GPA omitted, use this to call more general constructor
		// providing 0 as the default GPA.
		this(name, studentID, 0);
	}

	public Student(String name, String studentID, double gpa) {
		// Call the constructor of our superclass (Person) to set the name.
		super(name);
		// Best practice is to call our setters to store the values provided
		// instead of assigning them directly our variables. This allows the
		// setters to enforce validation without having to duplicate that logic here.
		setStudentID(studentID);
		setGpa(gpa);
	}

	public String getStudentID() {
		return studentID;
	}

	public double getGpa() {
		return gpa;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String toString() {
		return "Name: " + getName() + " - Student ID: " + studentID;
	}
}
