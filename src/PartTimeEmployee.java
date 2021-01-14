
public class PartTimeEmployee extends Employee {
	private double hourlyWage;
	private int hours;
	
	/**
	 * Default constructor
	 */
	public PartTimeEmployee(){
		super(); //default constructor from class Employee
		hourlyWage = 0.0;
	}
	/**
	 * Constructor with parameters
	 * @param name assigned using super constructor
	 * @param age assigned using super constructor
	 * @param ID assigned using super constructor
	 * @param hireDate assigned using super constructor
	 * @param hourlyWage assigned to this.
	 * @param hours assigned to this. 
	 */
	public PartTimeEmployee(String name, int age, int ID, String hireDate, double hourlyWage,int hours) { 
		super(name,age,ID,hireDate);
		this.hourlyWage = hourlyWage;
		this.hours=hours;
	}
	 /**
	  * Getter method
	  * @return returns hourlyWage of type double
	  */
	public double getHourlywage() {
		return hourlyWage;
	}
	
	/**
	 * Setter method
	 * @param hw to be assigned to hourlyWage in this method
	 */
	public void setHourlywage(double hw) {
		hourlyWage = hw;
	}
	/**
	 * Getter method
	 * @return returns hours of type int
	 */
	public int getHours() {
		return hours;
	}
	
	/**
	 * Setter method
	 * @param h to be assigned to hours in this method
	 */
	public void setHours(int h) {
		hours = h;
	}
	
	/**
	 * returns formatted output
	 */
	public String toString() {
		String output;
		output = super.toString() + String.format("%-6.2f",getSalary());
		return output;
		
		//return super.toString() + " " + hourlyWage;	
		}
	
	/**
	 * returns calculated
	 */
	public double getSalary() {
		return hourlyWage * hours;
	}
	
}
