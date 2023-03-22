class multi extends Thread{
   public void run(){
       System.out.println("Thread Extended by the class is running: ");
       for(int i=1;i<5;i++){
           System.out.println("Thread class "+i);
           try{Thread.sleep(500);}
           catch(InterruptedException e){System.out.println(e);}
           System.out.println(i);
       }
   }

}
class multi1 implements Runnable{
    public void run(){
        System.out.println("Thread implemented by the interface is running: ");
        for(int i=1;i<5;i++){
            System.out.println("Runnable interface "+i);
            try{Thread.sleep(1000);}
            catch(InterruptedException e){System.out.println(e);}
            System.out.println(i);
        }
    }
}
public class Main {
    public static void main(String[] args) throws InterruptedException {

        multi t = new multi();
        Thread thread = new Thread(t);


        multi1 t1 = new multi1();
        Thread thread1 = new Thread(t1);

        thread.run();
        System.out.println("Using join");
        thread.join(1000);
        thread1.run();

    }
}