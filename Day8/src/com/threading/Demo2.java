package com.threading;

public class Demo2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run invoked ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 demo2=new Demo2();
		Thread t1=new Thread(demo2);
		//new Thread(Runnable ref)
		t1.start();
	}

	

}