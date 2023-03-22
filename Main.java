import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Runnable runnable = ()-> System.out.println("This is a Runnable instance");
        executor.execute(runnable);

        Callable<String> callable = () -> {return "This is a Callabel instance";};
        Future<String> future = executor.submit(callable);
        String result = future.get();
        System.out.println(result);
        executor.close();


    }
}