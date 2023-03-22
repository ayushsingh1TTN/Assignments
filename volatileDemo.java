public class volatileDemo {
    private volatile int counter = 0;

    public void Increment() {


        for (int i = 0; i < 3; i++) {
            counter++;
            System.out.println(counter);
        }

    }

    public static void main(String[] args) {


        volatileDemo vo = new volatileDemo();

        Runnable runnable = () -> {
            vo.Increment();
        };


        Thread t1 = new Thread(runnable);
        t1.start();

        Thread t2 = new Thread(() -> {


            vo.Increment();


        });
        t2.start();
    }
}