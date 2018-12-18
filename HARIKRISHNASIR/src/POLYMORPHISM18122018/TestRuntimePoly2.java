package POLYMORPHISM18122018;
class Animal{
	void eat() {
		
	}
}
class Dog extends Animal{
	void eat() {
		System.out.println("eating cat");
	}
}
class Cat extends Animal
{
	void eat() {
		System.out.println("eating rat");
	}
}
public class TestRuntimePoly2 {
public static void main(String[] args) {
	//declaring the Animal ref variable
	Animal a;
	a=new Cat();
	a.eat();
	a=new Dog();
	a.eat();
}
}
