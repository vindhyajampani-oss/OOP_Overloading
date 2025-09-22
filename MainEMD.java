package co.codegnan.OOP.Overloading;

public class MainEMD {

	public static void main(String[] args) {
		Employee emp1=new Manager("Vindhya",50000,"HR");
		emp1.displayDetails();
		
		
        Employee emp2=new Developer("Jyotshna", 40000,"Java");
        emp2.displayDetails();
	}

}
