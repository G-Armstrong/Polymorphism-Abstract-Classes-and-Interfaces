
public class Student extends Person {
	private String major;
	private int id;
	private double gpa;
// Constructors
	/**
	 * Default constructor
	 */
	public Student(){
		super(); //default constructor from class Person
		major = ""; id = 0; gpa = 0.0;
	}
	/**
	 * Constructor with parameters
	 * @param name assigned using super constructor
	 * @param age assigned using super constructor
	 * @param id assigned to data member of this class
	 * @param major assigned to data member of this class
	 * @param gpa assigned to data member of this class
	 */
	public Student(String name, int age, int id, String major, double gpa) { 
		super(name,age);
		this.major = major; this.id = id; this.gpa = gpa;
	}

	/**
	 * Getter method 
	 * @return returns major of type String
	 */
	public String getMajor(){
	return major;
	}
	/**
	* Getter method 
	* @return returns id of type int
	*/
	public int getID(){
	return id;
	}
	/**
	 * Getter method
	 * @return returns gpa of type double
	 */
	public double getGPA(){
	return gpa;
	}
	/**
	 * Setter method
	 * @param m to be assigned to major
	 */
	public void setMajor(String m){
	major = m;
	}
	/**
	 * Setter method
	 * @param i to be assigned to id
	 */
	public void setID(int i){
		id = i;
	}
	/**
	 * Setter method
	 * @param g to be assigned to gpa
	 */
	public void setGPA(double g){
	gpa = g;
	}
	
	/**
	 * returns formatted output
	 */
	public String toString() {
		String output;
		output = super.toString() + String.format("%-10d%-15s%-5.2f",id,major,gpa);
		return output;
	}
	
	/**
	 * Compares gpa's using type conversion
	 */
	public int compareTo(Person p) {
		Student s = (Student) p;
		if(getGPA()==s.getGPA()) {
			return 0;
		}
		else if(getGPA() > s.getGPA()) {
			return 1;
		}
		else
			return -1;
		
	}
}
