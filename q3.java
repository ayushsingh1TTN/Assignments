import java.util.stream.IntStream;

public class q3 {
    public static void main(String[] args) {
        IntStream.range(1,5).forEach(System.out::println);
        System.out.println("---Range closed---");
        IntStream.rangeClosed(1,5).forEach(System.out::println);
    }
}
