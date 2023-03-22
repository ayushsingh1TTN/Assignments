public class q2 {
    private int count = 0;


    public synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread().getName()+" Method Count is now: " + count);
    }

    public void decrement(){

        synchronized (this){
            System.out.println(Thread.currentThread().getName()+" Block count is now "+ count);
            count--;
        }

    }

    public static void main(String[] args) throws InterruptedException {
        q2 main = new q2();


        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                main.increment();


            }

        });

        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                main.increment();
                main.decrement();

            }
        };

        Thread t2 = new Thread(runnable);


        t1.start();

        t2.start();



        System.out.println("\n"+"Final count: " + main.count);
    }
}
