package co.codegnan.OOP.Overloading;

import java.util.Scanner;

public class Employee_02Info extends Employee_02{

	 double salaryPerYear;
	 public Employee_02Info() {
		 super("","",0);
	 }
	 
	 public void inputEmployeedetails() {
		 Scanner scanner=new Scanner(System.in);
		 System.out.println("Enter employee Name : ");
		 employeeName=scanner.next();
		 System.out.println("Enter employee Designation : ");
		 designation=scanner.next();
		 System.out.println("Enter years of experience : ");
		 yearsofExperience=scanner.nextInt();
		 System.out.println("Enter salary per year : ");
		 salaryPerYear=scanner.nextInt();
		 
	 }
	 
	 public void displayEmployee_02Info() {
		 System.out.println("Employee name : "+employeeName);
		 System.out.println("Designation : "+designation);
		 System.out.println("Years of Experience: "+yearsofExperience);
		 
	 }
	 
	 public void calculateSalary() {
		 double salary = salaryPerYear * yearsofExperience;
		 System.out.println("Salary : "+salary);
	 }
}
