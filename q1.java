import java.util.*;
public enum q1{
    VILLA("VILLA", 10000000), MANSION("MANNSION", 9000000), APARTMENT("APARTMENT", 8000000),
    FLAT("FLAT", 7000000);

    final private String house;
    final private double price;

    q1(String house, double price) {
        this.house = house;
        this.price = price;
    }

    public String getHouse() {
        return house;
    }

    public double getPrice() {
        return price;
    }
}
class q2{
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        System.out.print("Enter the type: ");
       String sc = s.nextLine();
       q1 h = q1.valueOf(sc.toUpperCase());

        switch (h){
            case VILLA :  q1 vi = q1.VILLA;
                System.out.println(vi.getHouse()+" "+vi.getPrice());
                break;
            case MANSION: q1 ma = q1.MANSION;
                System.out.println(ma.getHouse()+" "+ma.getPrice());
                break;
            case FLAT: q1 fl = q1.FLAT;
                System.out.println(fl.getHouse()+" "+fl.getPrice());
                break;
            case APARTMENT: q1 ap = q1.APARTMENT;
                System.out.println(ap.getHouse()+" "+ap.getPrice());
                break;

            default: break;

        }
    }
}

