sealed class vehical permits car,bike{ }
final class car extends vehical{
    void wheel(){
        System.out.println("Car has 4 wheels");;
    }
}
final class bike extends vehical{

    void wheel(){
        System.out.println("Bike has 2 wheels");;
    }
}
public class q12 {
    public static void main(String[] args) {
        car c = new car();
        c.wheel();

        bike b = new bike();
        b.wheel();
    }
}
