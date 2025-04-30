package oops;

public class Counter {
	int i;
	int j;
	
	public void increment() {
		i++;
	}
	
	public synchronized void up() {
		j++;
	}

}
