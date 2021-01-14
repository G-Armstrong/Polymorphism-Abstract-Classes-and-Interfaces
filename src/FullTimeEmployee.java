
public class FullTimeEmployee extends Employee {
	private double annualSalary;
	
	/**
	 *  Default constructor
	 */
	public FullTimeEmployee(){
		super(); //default constructor from class Employee
		annualSalary = 0.0;
	}
	/**
	 * Constructor with parameters
	 * @param name assigned using super constructor
	 * @param age assigned using super constructor
	 * @param ID assigned using super constructor
	 * @param hireDate assigned using super constructor
	 * @param annualSalary assigned to this.annualSalary
	 */
	public FullTimeEmployee(String name, int age, int ID, String hireDate, double annualSalary) { 
		super(name,age,ID,hireDate);
		this.annualSalary = annualSalary;
	}
	
	/**
	 * setter method to set methods parameter to this method's data member
	 * @param annualSalary
	 */
	public void setAnnualsalary(double annualSalary) {
		this.annualSalary=annualSalary;
	}
	
	/**
	 * returns formatted output
	 */
	public String toString() {
		String output;
		output = super.toString() + String.format("%-6.2f",annualSalary) + "/year";
		return output;
		
		
	}
	
	/**
	 * Getter method to return annualSalary of type double
	 */
	public double getSalary() {
		return annualSalary;
	}
	
}
