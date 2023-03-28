package multiThreading;

//create your thread

class UserThread extends Thread{
	public void run() {
		//task for thread in run()
		System.out.println("this is User defined thread");
	}
}

public class ThreadOp {

	public static void main(String[] args) {
		System.out.println("program started");
		int x=22+33;
		System.out.println("sum="+x);
		//current thread
		Thread t= Thread.currentThread();
		String tname=t.getName();
		System.out.println("Current running thread is: "+tname);
		
		//setName
		t.setName("MyMain");
		System.out.println(t.getName());
		//sleep //in try catch
		try {
			Thread.sleep(1000);

		}catch(Exception e) {
			e.printStackTrace();
		}
		//aft 1ms  line 24 will execute
		
		System.out.println(t.getId());
		
		
		System.out.println("program ended");
		
		//going to start user difined thread
		UserThread thread= new UserThread();
		thread.start();
		
	}

}
