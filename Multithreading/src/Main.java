
public class Main {
	public static void main(String args[]) {
	
		//Myclass cl= new Myclass();
		//Bird b= new Bird();
	
	     Thread t1= new Thread(new Myclass());
	      
	      Thread t2= new Thread(new Bird());
	      t1.start();
	      t2.start();
	      t1.setPriority(5);
	      t2.setPriority(3);
	      
	      try {
	    	  t1.join();
	    	  t2.join();
	      }
	      catch(Exception e) {
	    	  System.out.println(e.getMessage());
	      }

}
}
