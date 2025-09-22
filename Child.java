package co.codegnan.OOP.Overloading;

public class Child extends Parent{
	int x=20;
	public Child() {
		super();
		System.out.println("Child Constructor");
	}
       public void display() {
    	   super.display();
    	   System.out.println("Child x "+x);
    	   System.out.println("Parent x : "+super.x);
    	   
    	   
       }
}
