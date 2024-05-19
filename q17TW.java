/* 
      NAME: SANYAM RAWAT
      SECTION: D
      ROLL NO: 58
*/


class Data {
    private int value;
    private boolean produced = false;
  
    public synchronized void produce(int newValue) {
        // Wait until the consumer has consumed the previous value
        while (produced) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        // Produce the new value
        value = newValue;
        System.out.println("Produced: " + value);
        produced = true;
        
        // Notify the consumer that a new value is available
        notify();
    }
    
    public synchronized int consume() {
        // Wait until the producer has produced a new value
        while (!produced) {
            try {
                  wait();
                } catch (InterruptedException e) {
                  e.printStackTrace();
              }
            }
            
            // Consume the value
            System.out.println("Consumed: " + value);
            produced = false;
            
            // Notify the producer that the value has been consumed
            notify();
            
            return value;
        }
    }
    
    class Producer extends Thread {
        private Data data;
        
        public Producer(Data data) {
            this.data = data;
        }
        
        public void run() {
            for (int i = 1; i <= 5; i++) {
                data.produce(i);
            }
        }
    }
    
    class Consumer extends Thread {
        private Data data;
        
        public Consumer(Data data) {
            this.data = data;
        }
  
        public void run() {
          for (int i = 1; i <= 5; i++) {
              data.consume();
            }
        }
    }
    
    public class q17TW {
      public static void main(String[] args) {
          Data data = new Data();
          System.out.println("\t\t\t******OUTPUT******");
          Producer producer = new Producer(data);
          Consumer consumer = new Consumer(data);
  
          producer.start();
          consumer.start();
      }
  }
  