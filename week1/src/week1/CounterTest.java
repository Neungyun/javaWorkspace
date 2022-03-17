/**
 * CounterTest.java
 * 
 * 계수기(Counter)를 정의하고 테스트하는 프로그램
 *
 */

package week1;
/**
 * 계수기(Counter)를 생성한 후 테스트 한다.
 * @author 능윤
 *
 */

public class CounterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c = new Counter(); 
		// c 는 instance(instantiation)(실체화된 변수, 메모리의 일부를 변수에 할당해준것)
		// new --> new는 클래스 타입의 인스턴스(객체)를 생성해주는 역할을 담당한다. 
		//new 연산자를 통해 메모리(Heap 영역)에 데이터를 저장할 공간을 할당받고 
		//그 공간의 참조값(reference value /해시코드)을 객체에게 반환하여 주고 이어서 생성자를 호출하게 된다.
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
 * 계수기(Counter)를 정의하는 클래스로 현재 값(currentCount),
 * 증가(incrementCount), reset 을 위한 메소드를 제공한다.
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
