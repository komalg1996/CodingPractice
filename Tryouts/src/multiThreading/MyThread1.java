package multiThreading;

public class MyThread1 implements Runnable {

	public static void main(String[] args) {
		//create object of MyThread class to create Thread
		MyThread1 t=new MyThread1();
		
		
		Thread thread = new Thread(t);//extra line as start() in Thread class
		
		//object of MyThread2
		
		MyThread2 t2=new MyThread2();

		thread.start();
		t2.start();
	}

	@Override
	public void run() {
		System.out.println("T1 runing");
		for(int i = 1;i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	

}
