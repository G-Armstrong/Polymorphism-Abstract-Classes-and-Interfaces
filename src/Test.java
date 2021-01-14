
public class Test {

	public static void main(String[] args) {
		Person[] personList = new Person[10];
		personList[0]=new Student("Lucy Treston",20,12345,"CSE",3.75);
		personList[1]=new Student("Mark Brown",18,12344,"ISE",3.50);
		personList[2]=new FullTimeEmployee("Jerry Zurcker",25,3333333,"03/10/2017",500000);
		personList[3]=new PartTimeEmployee("Sharon Luft",22,6666666,"01/01/2010",32.0,100);
		personList[4]=new Student("Emma Packard",19,12355,"CSB",3.0);
		personList[5]=new Student("Felix Hirpara",22,55123,"CSE",2.75);
		personList[6]=new PartTimeEmployee("Jade Farrar",29,1111111,"07/22/2012",22.0,45);
		personList[7]=new Student("Junita Stoltzman",21,44123,"ISE",2.5);
		personList[8]=new PartTimeEmployee("Brian Lin",31,7777777,"02/01/2014",35.0,31);
		personList[9]=new FullTimeEmployee("Alicia Bubash", 35,5555555, "08/01/2018", 125000);
		System.out.println("List of people:");
		System.out.println("Name                     Age  ID	Major/HireDate GPA/Salary");
		for(int i=0;i<personList.length;i++) {
			System.out.println(personList[i].toString());
		}
		System.out.println();
		System.out.println("List of students:");
		System.out.println("Name			 Age  ID	Major	       GPA");
		printSortedStudents(personList);
		
		System.out.println();
		System.out.println("List of employees:");
		System.out.println("Name			 Age  ID	HireDate       Salary");
		printSortedEmployees(personList);
	}
	
	/**
	 * Sorts array passed using compareTo
	 * @param list array to be sorted
	 * @param start value for loop
	 * @param end value for loop
	 */
	public static void sort(Person[] list, int start, int end) {
		Person min;
		int minIndex;
		for(int i=start;i<end;i++) {
			min = list[i]; minIndex =i;
			for(int j=i+1;j<end;j++) {
				if(list[j].compareTo(min) < 0) {
					min = list[j]; minIndex = j;
				}
			}
			Person temp = list[i];
			list[i] = list[minIndex];
			list[minIndex]=temp;
		}
	}
	/**
	 * calls sort on studentList and prints it
	 * @param list to have Student objects selected from
	 */
	public static void printSortedStudents(Person[] list) {
		Student[] studentList= new Student[5];
		int count =0;
		for(int i=0;i<list.length;i++) {
			if(list[i] instanceof Student) {
				studentList[count] = (Student)list[i];
				count++;
			}
		}
		sort(studentList,0,5);
		for(int i=0;i<studentList.length;i++) {
			System.out.println(studentList[i].toString());
			
		}
	}
	/**
	 * calls sort on employeeList and prints it
	 * @param list to have Employee objects selected from
	 */
	public static void printSortedEmployees(Person[] list) {
		Employee[] employeeList= new Employee[5];
		int count =0;
		for(int i=0;i<list.length;i++) {
			if(list[i] instanceof Employee) {
				employeeList[count] = (Employee)list[i];
				count++;
			}
		}
		sort(employeeList,0,5);
		for(int i=0;i<employeeList.length;i++) {
			System.out.println(employeeList[i].toString());
			
		}
	}
	
	


}
