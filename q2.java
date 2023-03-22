import java.util.concurrent.locks.ReentrantLock;

class BankAccount{
    private float balance;
    ReentrantLock lock = new ReentrantLock();
    private int accountNumber;
    public BankAccount(int accountNumber,float balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void withdrawal(float amount){
        lock.lock();
        try {
            if (balance < amount) {
                System.out.println("Not enough balance");
                return;
            } else {
                balance -= amount;
                System.out.println("Withdrawal of amount " + amount + " is successful. Balance is " + balance);
            }
        }
        finally {
            System.out.println("Lock release "+Thread.currentThread().getName());
            lock.unlock();
        }
    }
    public void deposit(float amount) {
        lock.lock();
        try {
            balance += amount;
            System.out.println("Balance is " + balance);
        }
        finally {
            System.out.println("Lock release "+Thread.currentThread().getName());
            lock.unlock();
        }
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public float getBalance(){
        return balance;
    }
}
public class q2 {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1234, 344.56f);
        BankAccount account2 = new BankAccount(1235, 344.56f);

        new Thread(new Runnable() {
            @Override
            public void run() {
                account1.deposit(44);
                account1.withdrawal(1234);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                account2.deposit(45);
                account2.withdrawal(1256);
            }
        }).start();
    }
}
