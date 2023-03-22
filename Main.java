import java.util.function.IntBinaryOperator;

interface twonumbers{
    boolean result(int a, int b);
}
public class Main {
    public static void main(String[] args) {
        twonumbers tn = (a, b) -> a > b ? true : false;
        System.out.println("First number is greater than the Second one: "+tn.result(4, 6));
    }

}