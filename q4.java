import java.util.Random;
import java.util.concurrent.*;

public class q4 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<Integer> futureRandom = executor.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Random ran = new Random();
                int RandonNum = ran.nextInt(100);
                Thread.sleep(1000);
                return RandonNum;
            }
        });

        System.out.println("Waiting for future for the result");
        if(futureRandom.isDone()){
            try{
                System.out.println("Future is Completed "+ futureRandom.get());
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        else System.out.println("Waiting for future to complete");

        executor.shutdown();

    }
}
