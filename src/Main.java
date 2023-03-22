import java.util.*;
public class Main {
    public static double area(int radius){
        double ar = 3.14 * radius * radius;
        return ar;
    }
    public static double cir(int radius){
        double c = 2 * 3.14 * radius;
        return c;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r = 0;
        System.out.println("*******Menu*******");
        System.out.println("1. Calculate Area of Circle");
        System.out.println("2. Calculate Circumference of a Circle");
        System.out.println("3. Exit.");
        int option = s.nextInt();
        switch(option){
            case 1: System.out.println("Enter Radius: ");
                r=s.nextInt();
                System.out.println("Area "+area(r));
                break;

            case 2: System.out.println("Enter Radius: ");
            r=s.nextInt();
            System.out.println("Circumference "+cir(r));
                break;

            case 3: System.out.println("Exit");
                break;

            default: System.out.println("Not valid");
        }


    }
}