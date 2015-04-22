package Threads;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t;
		t=Thread.currentThread();
		newthread obj1=new newthread("my extending thread");
		try
		{
			while(t.isAlive()){System.out.println("main thread will be alive till the child thread is alive");
			t.sleep(500);
			if(obj1.t.isAlive()==false)
				break;
			}
		}catch(InterruptedException e)
		{
			System.out.println("main thread interrupted");
		}
		
		try {
			System.out.println("Waiting for threads to finish.");
			obj1.t.join();
			} catch (InterruptedException e) {
			System.out.println("Main thread Interrupted");
			}
		System.out.println("my extending thread run is over");
		System.out.println("main thread run is over.");

	}

}
