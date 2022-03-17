/**
 * CounterTest.java
 * 
 * �����(Counter)�� �����ϰ� �׽�Ʈ�ϴ� ���α׷�
 *
 */

package week1;
/**
 * �����(Counter)�� ������ �� �׽�Ʈ �Ѵ�.
 * @author ����
 *
 */

public class CounterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c = new Counter(); 
		// c �� instance(instantiation)(��üȭ�� ����, �޸��� �Ϻθ� ������ �Ҵ����ذ�)
		// new --> new�� Ŭ���� Ÿ���� �ν��Ͻ�(��ü)�� �������ִ� ������ ����Ѵ�. 
		//new �����ڸ� ���� �޸�(Heap ����)�� �����͸� ������ ������ �Ҵ�ް� 
		//�� ������ ������(reference value /�ؽ��ڵ�)�� ��ü���� ��ȯ�Ͽ� �ְ� �̾ �����ڸ� ȣ���ϰ� �ȴ�.
		System.out.println("count value: " + c.currentCount());
		c.incrementCount();
		System.out.println("count value: " + c.currentCount());
		c.incrementCount();
		System.out.println("count value: " + c.currentCount());
		c.reset();
		System.out.println("count value: " + c.currentCount());

	}

}

/**
 * �����(Counter)�� �����ϴ� Ŭ������ ���� ��(currentCount),
 * ����(incrementCount), reset �� ���� �޼ҵ带 �����Ѵ�.
 */
class Counter{
	private int count;

	public Counter()
	{
		count=0;
	}
	public int currentCount()
	{
		return count;
	}
	
	
	public void incrementCount()
	{
		count = count + 1;
	}
	
	public void reset()
	{
		count = 0;
	}
}
