package POLYMORPHISM18122018;
class Bike1{
	int speedLimit = 90;
	
}
class Honda extends Bike1{
	int speedLImit =120;
}
public class DataMember {
public static void main(String[] args) {
	Bike1 obj = new Honda(); //as the object is created to Honda , if it is overrden it should give 120
	System.out.println(obj.speedLimit);//it gives 90 because it isnt overiden
}
}
