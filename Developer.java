package co.codegnan.OOP.Overloading;

public class Developer extends Employee {
String programmingLanguage;
	public Developer(String name, double salary, String programmingLanguage) {
		this.name=name;
		this.salary=salary;
		this.programmingLanguage=programmingLanguage;
		}
	
	public void displayDetails() {
		System.out.println("Developer Details");
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary);
		System.out.println("programmingLanguage : "+programmingLanguage);
	}
}
