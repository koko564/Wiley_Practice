package com.threading;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DaemonThread extends Thread {
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			try {
				FileWriter fis=new FileWriter("d:\\sample.txt");
				fis.write("hello");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			display();
		}
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " is running and value of i = " + i);
		}
	}
	
	public static void display() {
		System.out.println("Display invoked ");
	}

	public static void main(String[] args) {
		ExecutorService es=Executors.newSingleThreadExecutor();
	
		DaemonThread thread1 = new DaemonThread();
		thread1.setName("Thread1");
		DaemonThread thread2 = new DaemonThread();
		thread2.setName("Thread2");
		DaemonThread thread3 = new DaemonThread();
		thread3.setName("Thread3");

		thread1.setDaemon(true);

		thread1.start();
		thread2.start();
		thread3.start();
	}
}