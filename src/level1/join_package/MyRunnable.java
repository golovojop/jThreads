package level1.join_package;

public class MyRunnable  implements Runnable {

    private final int ITERATIONS = 3;
    private Thread thread;

    public MyRunnable(String _name) {
        thread = new Thread(this, _name);
        //thread.start();
    }

    @Override
    public void run() {
        for(int i = 0; i < ITERATIONS; i++) {
            System.out.printf("Thread %s, count %d\n", thread.getName(), i);
            try {
                Thread.sleep(1000);
            }
            catch (Exception e) {
                System.out.println("Method sleep() interrupted");
            }
        }
    }

    public Thread getThread() {
        return thread;
    }

}


