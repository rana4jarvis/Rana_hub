package POLYMORPHISM18122018;
class Animal2{
	void eat() {
		System.out.println("eating");
	}
}
class Dog2 extends Animal2{
	void eat() {
		System.out.println("eating rat");
	}
}

public class BabyDog2 extends Dog2
{
public static void main(String[] args) {
	Animal2 a = new BabyDog2();
	a.eat(); //since Babydog is not overriding the eat method it automatically invokes the eat method of the Dog class
	
}
}
