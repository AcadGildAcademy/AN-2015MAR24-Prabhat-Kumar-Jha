package Threads;

public class newthread implements Runnable{
String name; // name of thread
Thread t;
boolean suspendFlag;
newthread(String threadname)
{
name = threadname;
t = new Thread(this, name);
System.out.println("my thread created " + t);

t.start(); // Start the thread
}

// This is the entry point for thread.
public void run() {
try {
for(int i = 0; i <10; i++) {
System.out.println( "printing the count: " + i);
Thread.sleep(1000);
}
}catch (InterruptedException e) 
{
System.out.println(name + " interrupted.");
}
}

}
