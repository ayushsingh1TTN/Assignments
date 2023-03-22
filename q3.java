import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class q3 {
    public static void main(String[] args) throws InterruptedException {
        List<Runnable> tasks = Arrays.asList(
                ()-> System.out.println("Task1"),
                ()-> System.out.println("Task2"),
                ()-> System.out.println("Task3"),
                ()-> System.out.println("Task4")
        );

        ExecutorService single = Executors.newSingleThreadExecutor();
        ExecutorService cached = Executors.newCachedThreadPool();
        ExecutorService fixed = Executors.newFixedThreadPool(2);

        for(Runnable task : tasks){
            single.submit(task);
            cached.submit(task);
            fixed.submit(task);
        }

        single.shutdown();
        cached.shutdown();
        fixed.shutdown();

        single.awaitTermination(100, TimeUnit.MILLISECONDS);
        cached.awaitTermination(100, TimeUnit.MILLISECONDS);
        fixed.awaitTermination(100, TimeUnit.MILLISECONDS);
    }
}
