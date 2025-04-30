
public class Myclass extends Thread {
	public void run() {
		try{
		System.out.println("Hello");
	}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
			
		}

}
