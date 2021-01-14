
public abstract class Person implements Comparable<Person> {
	private String name;
	private int age;
	/**
	 * Default constructor
	 */
	protected Person() {
		name="";
		age=0;
	}
	/**
	 * Constructor with parameters
	 * @param name assigned to data member of this class
	 * @param age assigned to data member of this class
	 */
	protected Person(String name, int age) {
		this.name = name;
		this.age=age;
	}
	/**
	 * Getter method
	 * @return returns name of type String
	 */
	public String getName() {
		return name;
	}
	/**
	 * Setter method
	 * @param n set to name of type String
	 */
	public void setName(String n) {
		name = n;
	}
	/**
	 * Getter method
	 * @return returns age of type int
	 */
	public int getAge() {
		return age;
	}
	/**
	 * Setter method
	 * @param a set to age of type int
	 */
	public void setAge(int a) {
		age = a;
	}
	/**
	 * Returns formatted output
	 */
	public String toString() {
		String output;
		output = String.format("%-25s%-5d", name, age);
		return output;
	}
}
