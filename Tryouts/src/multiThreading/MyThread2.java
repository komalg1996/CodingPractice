package multiThreading;
//Creating Thread using Thread class
public class MyThread2 extends Thread{

	public static void main(String[] args) {
		
		MyThread2 t =new MyThread2();
		
		t.start();
	}
	
	public void run() {
			for(int i=10;i>=1;i--) {
				System.out.println(i);
				
				try {
					Thread.sleep(1000);
					
				}catch(Exception e) {
					
				}
			}
	}

}
