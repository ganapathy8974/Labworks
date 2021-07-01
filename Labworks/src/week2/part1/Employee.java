package week2.part1;

public class Employee {
	int empId;
	String empName;
	
	Employee(int id, String name){
		empId = id;
		empName = name;
	}
	void info() {
		System.out.println("Id: "+empId+"\tName:"+empName);
	}
	public static void main(String args[]) {
		Employee obj1 = new Employee(100, "Ganu");
		Employee obj2 = new Employee(200, "Manu");
		obj1.info();
		obj2.info();
	}
}
