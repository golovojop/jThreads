package level1.synchronized_package;

public class MainSync {
    public static void main(String[] args){
        Dummy dummy = new Dummy("Simple Dummy");

        MyThread th1 = new MyThread("th1", dummy, DummyMethods.ONE);
        MyThread th2 = new MyThread("th2", dummy, DummyMethods.TWO);
        try {
            th1.join();
            th2.join();
        }
        catch (Exception e) {
            System.out.println("Method join() interrupted");
        }
    }
}

class MyThread extends Thread {

    private Dummy dummy;
    private DummyMethods dm;

    public MyThread(String _name, Dummy _dummy, DummyMethods _dm) {
        super(_name);
        dummy = _dummy;
        dm = _dm;
        this.start();
    }

    @Override
    public void run() {

        switch (dm){
            case ONE:
                dummy.methodOne();
                break;
            case TWO:
                dummy.methodTwo();
        }
    }
}
