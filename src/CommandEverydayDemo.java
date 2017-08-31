
public class CommandEverydayDemo {

	public static void main(String[] args) {
		
		Task task1 = new Task(10,12);
		Task task2 = new Task(11, 13);
		
	
		Thread thread1 = new Thread(task1);
		thread1.start();
		
		Thread thread2 = new Thread(task2);
		thread2.start();
		
		
		
	}
}

class Task implements Runnable {
	
	int num1;
	int num2;

	
	Task(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	
}

	@Override
	public void run() {  // execute 
			System.out.println(num1 * num2);
			System.out.println(num1 * num1);
			System.out.println(num2);
			
			
	}
	
}