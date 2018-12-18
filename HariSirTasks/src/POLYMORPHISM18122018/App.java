package POLYMORPHISM18122018;
interface Human{
	void sayhi();
}
class Male implements Human{
	public void sayhi() {
		Iplayer ip = new Vlc();
		ip.play("male");
	}
}
class Female implements Human{
	public void sayhi() {
		Iplayer ip = new Wmp();
		ip.play("female");
	}
}
interface Iplayer{
	void play(String tone);
}
class Vlc implements Iplayer{
	public void play(String tone) {
		System.out.println("this is  from vlc "+tone);
	}
}
class Wmp implements Iplayer{
	public void play (String tone) {
		System.out.println("this is from wmp "+tone);
	}
}

public class App {
public static void main(String[] args) {
	Human h =null;
	String gender ="f";
	if(gender=="m") {
		h=new Male();
		}
	else {
		h=new Female();
		
	}
	h.sayhi();
}
}
