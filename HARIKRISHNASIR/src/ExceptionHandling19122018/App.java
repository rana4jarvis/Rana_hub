package ExceptionHandling19122018;
interface Itransact{
	void withdraw(String pin,int acc) throws Exception;
	
}
class Sbi implements Itransact{
	public void withdraw(String pin,int acc)throws Exception{
		pin=null;
		try {
			int length = pin.length();
			System.out.println(length);
			System.out.println("transaction succesful");
		}catch(Exception e) {
			System.out.println("not succusful");
		}
	}
}
public class App {
	public static void main(String[] args) throws Exception {
		Itransact i = new Sbi();
		i.withdraw( "1234",234);
	}

}
