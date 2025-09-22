package co.codegnan.OOP.Overloading;

public class Manager_01 extends Employee_01 {

    public Manager_01(String name, double basicsalary) {
        this.name = name;
        this.basicsalary = basicsalary;
    }

    public void displayDetails() {
        System.out.println("Manager Details");
        System.out.println("Name : " + name);
        System.out.println("Basic Salary : " + basicsalary);
    }

    
    public void calculateSalary(double bonus) {
        double total = basicsalary + bonus;
        System.out.println("Salary with Bonus : " + total);
    }

   
    public void calculateSalary(double bonus, double allowance) {
        double total = basicsalary + bonus + allowance;
        System.out.println("Salary with Bonus and Allowance : " + total);
    }
}
