package POLYMORPHISM18122018;
class Shape{
	void drawing() {
		System.out.println("drawing --");
	}
}
class Circle extends Shape{
	void drawing() {
		System.out.println("drawing circle");
	}
}
class Rect extends Shape{
	void drawing() {
		System.out.println("drawing rectangle");
	}
}
public class TestRuntimePoly1 {
public static void main(String[] args) {
	Shape s;
	s=new Circle();
	s.drawing();
	s=new Rect();
	s.drawing();
}
}
