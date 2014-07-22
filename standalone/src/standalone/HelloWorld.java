
package standalone;

public class HelloWorld {

	public static void main (String[] args) throws InterruptedException{
		long i = 0;
		do {
			System.out.println("Hello World "+ i++);
			Thread.sleep(30000);
		} while (true);
	}
	
}
