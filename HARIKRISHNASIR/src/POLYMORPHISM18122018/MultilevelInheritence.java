package POLYMORPHISM18122018;
class Animal1{
	void eat() {
		System.out.println("eating");
	}
}
class Dog1 extends Animal1{
	void eat() {
		System.out.println("eating fruits");
	}
}
class BabyDog1 extends Dog1{
	void eat() {
		System.out.println("drinking milk");
	}
}
public class MultilevelInheritence {
public static void main(String[] args) {
	Animal1 a;
	a=new Dog1();
	a.eat();
	Dog1 d=new BabyDog1();
	d.eat();
}
}
//conclusion is a super class object can hold the sub class object and overiding is achieved like that only