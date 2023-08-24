package Lambda;

public class ThreadDemo {
    public static void main(String[] args) throws Exception{

        // Creating First Thread
        Runnable thread1 = ()-> {
            // this is the body of the thread
            for(int i=0; i<=10; i++) {
                System.out.println("Inside First Thread and value of i is : " +i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t = new Thread(thread1);
        t.setName("Shiekh");
        t.setPriority(2); // Thread priority is used to set priority of thread to run.
        t.start();

        // Creating Second Thread
        Runnable thread2 = () -> {
            for (int i=0; i<=12; i++) {
                System.out.println("Inside Second Thread and value of i is : " + i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
                }
            }
        };
        Thread t2 = new Thread(thread2);
        t2.setName("Shiekh- Thread2");
        t2.setPriority(1);
        t2.run();
    }
}
