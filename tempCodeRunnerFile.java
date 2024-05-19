/* 
      NAME: SANYAM RAWAT
      SECTION: D
      ROLL NO: 58
*/


class Counter {
    private int count = 0;
    
    // Synchronized method
    System.out.println("\t\t\t******OUTPUT******");
      public synchronized void increment() {
          for (int i = 0; i <= 10; i++) {
              System.out.println("Synchronized Method: " + i);
              count++;
          }
      }
  
      // Synchronized method
      public synchronized int getCount() {
          return count;
      }
  
      // Synchronized block
      public void incrementWithSyncBlock() {
          synchronized (this) {
              for (int i = 0; i <= 10; i++) {
                  System.out.println("Synchronized Block: " + i);
                  count++;
              }
          }
      }
  
      // Synchronized block
      public int getCountWithSyncBlock() {
          synchronized (this) {
              return count;
          }
      }
  }
  
  class MyThread extends Thread {
      private Counter counter;
  
      public MyThread(Counter counter) {
          this.counter = counter;
      }
  
      public void run() {
          counter.increment();
          counter.incrementWithSyncBlock();
      }
  }
  
  public class q16TW {
      public static void main(String[] args) throws InterruptedException {
          Counter counter = new Counter();
  
          MyThread thread1 = new MyThread(counter);
          MyThread thread2 = new MyThread(counter);
  
          thread1.start();
          thread2.start();
  
          thread1.join();
          thread2.join();
  
          System.out.println("Count with synchronized method: " + counter.getCount());
          System.out.println("Count with synchronized block: " + counter.getCountWithSyncBlock());
      }
  }
  