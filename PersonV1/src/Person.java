// DO NOT MAKE ANY CHANGES TO THIS FILE

public abstract class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	// The use of final prohibits a child class from overriding this method.
	final public String getName() {
		return name;
	}

	// The use of final prohibits a child class from overriding this method.
	final public void setName(String name) {
		this.name = name;
	}
}
