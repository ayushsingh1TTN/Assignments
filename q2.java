import java.util.Arrays;
import java.util.List;

public class q2 {
    public static void main(String[] args) {
        List<Integer> lt = Arrays.asList(1,2,3,4,5,6,7,8);

        System.out.println("---TakeWhile---");
        lt.stream().takeWhile(e->e<5).forEach(System.out::println);
        System.out.println("---DropWhile---");
        lt.stream().dropWhile(e->e<5).forEach(System.out::println);
    }
}
