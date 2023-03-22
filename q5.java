import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class q5 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 10; i++) {
            executorService.submit(() -> {
                System.out.println("Task running");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Task complete");
            });
        }

        executorService.shutdownNow();

        try {
            if (!executorService.awaitTermination(4, TimeUnit.SECONDS)) {
                System.out.println("Some tasks are still running after 2 seconds");
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted while waiting for termination");
            executorService.shutdownNow();
        }
    }
}
