/**
 * Counter.java
 */
package week2;

public class Counter {
	public static void main(String[] args) {
		Count c = new Count();
		System.out.println("count:" + c.currentCounter()); // 0
		c.incrementCounter();
		System.out.println("count:" + c.currentCounter()); // 1
		c.decrementCounter();
		System.out.println("count:" + c.currentCounter()); // 0		
		c.decrementCounter();
		System.out.println("count:" + c.currentCounter()); // 0		
	}
}

class Count{ 
	private int count;
	
	public Count() { 
		System.out.println("initiate new Counter!");
		count = 0;
	}
	
	public int currentCounter() {
		return count;
	}
	
	public void incrementCounter() {
		System.out.println("increment!");
		count = count + 1;
	}
	
	public void decrementCounter() {
		System.out.println("decrement!");
		if(count > 0) count = count - 1;
		else count = 0;
	}
	
	public void reset() {
		count = 0;
	}
}
