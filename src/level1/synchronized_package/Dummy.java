package level1.synchronized_package;

enum DummyMethods {
    ONE, TWO;
}

public class Dummy {
    private String name;

    final int ITERATIONS = 5;

    public Dummy(String _name) {
        name = _name;
    }

    // synchronized - blocks access to all synchronized methods in current instance
    synchronized public void methodOne() {

        for(int i = 0; i < ITERATIONS; i++){
            try {
                System.out.printf("%s: methodOne, count %d\n", Thread.currentThread().getName(), i);
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.printf("Method sleep() was interrupted int thread %s\n", Thread.currentThread().getName());
            }
        }
    }

    // synchronized - blocks access to all synchronized methods in current instance
    synchronized public void methodTwo() {
        for(int i = 0; i < ITERATIONS; i++){
            try {
                System.out.printf("%s: methodTwo, count: %d\n", Thread.currentThread().getName(), i);
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.printf("Method sleep() was interrupted int thread %s\n", Thread.currentThread().getName());
            }
        }
    }
}
