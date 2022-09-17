//Basically, a ReadWriteLock is designed as a high-level locking mechanism that allows us 
//to add thread-safety feature to a data structure while increasing 
//throughput by allowing multiple threads to read the data concurrently and one thread to update the data exclusively.

//Multiple threads can read the data at the same time, as long as there’s no thread is updating the data.

//Only one thread can update the data at a time, causing other threads (both readers and writers) block until the write lock is released.

//Similar to ReentrantLock, the ReentrantReadWriteLock allows a thread to acquire the read lock or write lock multiple times recursively, 
//thus the word “Reentrant”.

import java.util.concurrent.locks.ReentrantReadWriteLock;

 
public class ReentrantReadWriteLockExampleMain {
 
private static final ReentrantReadWriteLock lock = new ReentrantReadWriteLock(true);
 
private static String number = "0";
 
public static void main(String[] args) throws InterruptedException{
  Thread t1 = new Thread(new Reader(),"Read 1");
  Thread t2 = new Thread(new Reader(),"Read 2");
  Thread t3 = new Thread(new WriterOdd(),"Write A");
  Thread t4 = new Thread(new WriterEven(),"Write B");
  t1.start();
  t2.start();
  t3.start();
  t4.start();
  t1.join();
  t2.join();
  t3.join();
  t4.join();
}
 
static class Reader implements Runnable {
 
  public void run() {
   for(int i = 0; i<= 10; i ++) {
    lock.readLock().lock();
    System.out.println(Thread.currentThread().getName() + " ---> Number is " + number );
    lock.readLock().unlock();
    }

   }
  }
 
static class WriterOdd implements Runnable {
 
  public void run() {
   for(int i = 1; i<= 7; i+=2) {
    try {
     lock.writeLock().lock();
     System.out.println("Writer A is writing");
     number = number.concat(" "+i);
    } finally {
     lock.writeLock().unlock();
    }
   }
   }
  }
 
static class WriterEven implements Runnable {
 
  public void run() {
   for(int i = 2; i<= 8; i +=2) {
    try {
     lock.writeLock().lock();
     System.out.println("Writer B is writing");
     number = number.concat(" "+i);
    } finally {
     lock.writeLock().unlock();
    }
   }
   }
  }
}
 