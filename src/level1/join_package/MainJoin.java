package level1.join_package;

import java.util.ArrayList;
import java.util.List;

public class MainJoin {
    public static void main(String[] args) {


        // Generate threads
        String[] thr_names = {"Thread_01", "Thread_02", "Thread_03"};
        List<MyRunnable> li = new ArrayList<MyRunnable>();

        for(String s : thr_names) {
            li.add(new MyRunnable(s));
        }

        // Join to threads
        for(MyRunnable mr : li) {
            try {
                Thread tr = mr.getThread();
                tr.start();
                System.out.printf("Joining to thread %s\n", tr.getName());
                tr.join();
                System.out.printf("Thread %s finished\n", tr.getName());
            }
            catch (Exception e) {
                System.out.println("join() method interrupted");
            }
        }
    }

}
