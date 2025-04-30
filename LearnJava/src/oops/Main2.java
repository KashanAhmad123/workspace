package oops;

public class Main2 {

	public static void main(String[] args) throws Exception {
		Counter c= new Counter();
		
		RandomN r2= new RandomN();
		Thread t= new Thread(r2);
		t.start();
		t.join();
		
		Random r= new Random();
		r.start();
		r.join();
		
		Thread t1= new Thread(new Runnable() {
			public void run() {
				for(int k=0;k<1000;k++) {
					c.increment();
				}
			}
		});
		
		Thread t2= new Thread(new Runnable() {

			
			public void run() {
				for(int j=0;j<1000;j++) {
					c.increment();
				}
				
			}
			
		});
		
		Thread t3= new Thread(new Runnable() {
			public void run() {
				for(int k=0;k<1000;k++) {
					c.up();
				}
			}
		});
		Thread t4= new Thread(new Runnable() {
			public void run() {
				for(int k=0;k<1000;k++) {
					c.up();
				}
			}
		});
		
		Thread t5= new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				c.increment();
			}
			
		});
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t1.join(); /* Main thread execute before t1 so we need to join t1 with main thread before it starts */
		t2.join();
		t3.join();
		t4.join();
		
		t3.setPriority(5);
		t4.setPriority(6);
		System.out.println(t1.getPriority());
		t2.setPriority(4);
		t2.sleep(1000);
		t5.setDaemon(true);
		t5.start();
		t5.join();
		
		System.out.println(c.i);
		System.out.println(c.j);
	}

}
