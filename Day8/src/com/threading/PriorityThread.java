package com.threading;

public class PriorityThread extends Thread{
	
	//implicitly invoked when the thread executes 
	public void run() {
		
		
		String threadName=Thread.currentThread().getName();
		
		for(int i=1;i<=5;i++) {
			System.out.println(i +" :generated by, "+threadName);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
	
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getId());
		
		PriorityThread demo1=new PriorityThread();
		PriorityThread demo2=new PriorityThread();
		PriorityThread demo3=new PriorityThread();
		//demo1.setName("MyThread");
		//demo1.run();
		demo1.start();//thread-0
		demo2.start();//thread-1
		demo3.start();//thread-2
		demo1.setPriority(10);
		
		
		
		
		
	}
}