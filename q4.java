import java.util.stream.IntStream;

public class q4 {
    public static void main(String[] args) {
        System.out.println("---Stream iterator---");
        IntStream.iterate(0, i->i<6, i->i+2).forEach(System.out::println);
    }
}
