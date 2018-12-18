package POLYMORPHISM18122018;
class Bike{
	void run() { //overriden method, we are going yo override this method in the child class
		
		System.out.println("running safely");
	}
}
public class Slendor extends Bike{  //we need to have IS-A relation ship to override the method of super class
void run() {
	System.out.println("running safely at 60 km"); 
}
public static void main(String[] args) {
	//now while calling the method only , we came to know which method we gonna call, based on the object 
	//so thats why this is called as runtime polymorphism 
	//we can use parent class reference variable to call the child class object (known as upcasting)
	Bike b = new Slendor();
	b.run(); //this calls the child class method 
	
}
}
