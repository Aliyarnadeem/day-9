package day9;
class x1 extends Thread 
{
	public void run() {
	System.out.println("the thread id no. for the x1 class is: " + Thread.currentThread().getId());
	}
}

class y2 extends Thread 
{
	public void run() {
		
	
	System.out.println("the thread id no. for the y2 class is: " + Thread.currentThread().getId());
}
}

class z3 extends Thread
{
	public void run() {
	System.out.println("the thread id no. for the z3 class is: " + Thread.currentThread().getId());
	}
}
public class MultiThreading implements Runnable
{
	public void run() {
		System.out.println("the thread id no. for the MULTITHREADING class is: " + Thread.currentThread().getId());
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		y2 c = new y2();
		c.setPriority(Thread.MAX_PRIORITY);
		c.start();
		z3 s = new z3();
		s.start();
		for(int i=0;i<5;i++)
		{
		x1 b = new x1();
		b.setPriority(Thread.NORM_PRIORITY);
		b.start();
		}
		MultiThreading m = new MultiThreading();
		Thread t = new Thread(m);
		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println("Id no. for main is: "+ Thread.currentThread().getId());
		t.start();
	}

}