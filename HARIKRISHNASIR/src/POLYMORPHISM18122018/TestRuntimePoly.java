package POLYMORPHISM18122018;
class Bank{
	float getRateOfInterest() {
		return 0;
		
	}
}
class Sbi extends Bank{
	float getRateOfInterest() {
		return 9.5f;
		
	}
}
class Axis extends Bank
{
	float getRateOfInterest() {
		return 8.5f;
		
	}
}
class Icici extends Bank{
	float getRateOfInterest() {
		return 7.5f;
		
	}
}
public class TestRuntimePoly {

public static void main(String[] args) {
	Bank b;
	b =new Sbi(); //here we used Bank ref variable to the sbi and icici , but the output varies for both depending on the object creation 
	                //this is called as the runtime polymorphism 
	System.out.println("Sbi interest rate is "+b.getRateOfInterest());
	b=new Icici();
	System.out.println("icici interest rate is "+b.getRateOfInterest());
}
}
