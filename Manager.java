package co.codegnan.OOP.Overloading;

public class Manager extends Employee {
  String department;
	public Manager(String name, double salary, String department) {
	this.name=name;
	this.salary=salary;
	this.department=department;
	}
	//over-riding
	public void displayDetails() {
		System.out.println("Manager Details");
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary);
		System.out.println("Department : "+department);
		
	}
}
