package POLYMORPHISM18122018;
/*The app has to run a welcome message to the people who arrived, based on their gender */

//interface 
interface Human{
	void sayhi(); //umimplemented method
}

//another interface for the player to play the audio file 
interface Iplayer{
//write a method to play the audio file 
	void play(String tone); //we have to implement this method in the follwing classes 
	
}
class Vlc implements Iplayer{
	public void play(String tone) {
		System.out.println("this is the voice of "+tone);
	}
}
class Wmp implements Iplayer{
	public void play(String tone) {
		System.out.println("this is the voice of "+tone);
	}
}


//now we have to know the male /female to play the voice , to know that first we should have classes for male and female
class Male implements Human{
	public void sayhi() { //we are going to implement the method in HUman interface 
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
public class App {
public static void main(String[] args) {
	
	//now if male arrives male voice should be played and so as to female
	//so for this we need to write the if condition
	Human h;
	String gender ="f";
	if(gender=="f") {
		h=new Female();
			}
	else {
		h=new Male();
		
	}
	h.sayhi(); //this will invoke the method based on the object created

}
}
