
public abstract class Employee extends Person {
	private int ID;
	private String hireDate;
	/**
	 * Default constructor
	 */
	protected Employee() {
		super();
		hireDate = "";
		ID=0;
	}
	/**
	 * Constructor with parameters
	 * @param name assigned using super constructor
	 * @param age assigned to data member of this class
	 * @param ID assigned to data member of this class
	 * @param hireDate assigned to data member of this class
	 */
	protected Employee(String name, int age, int ID, String hireDate) {
		super(name,age);
		this.ID=ID;
		this.hireDate=hireDate;
	}
	/**
	 * Getter method
	 * @return returns ID
	 */
	public int getID() {
		return ID;
	}
	/**
	 * Setter method
	 * @param id to be set to ID
	 */
	public void setID(int id) {
		ID = id;
	}
	/**
	 * Getter method
	 * @return returns hireDate
	 */
	public String getHireDate() {
		return hireDate;
	}
	/**
	 * Setter method
	 * @param hd to be set to hireDate
	 */
	public void setHireDate(String hd) {
		hireDate = hd;
	}
	/**
	 * Abstract method that has to be defined in the subclasses of this class
	 * @return
	 */
	public abstract double getSalary();
	
	/**
	 * returns formatted output
	 */
	public String toString() {
		String output;
		output = super.toString() + String.format("%-10d%-15s",ID,hireDate);
		return output;
	}
	/**
	 * Compares salaries using type conversion
	 */
	public int compareTo(Person p) {
		Employee e = (Employee) p;
		if(getSalary()==e.getSalary()) {
			return 0;
		}
		else if(getSalary() > e.getSalary()) {
			return 1;
		}
		else
			return -1;
		
	}
}
