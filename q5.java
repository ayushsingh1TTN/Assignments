import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class q5 {
    public static void main(String[] args) {
        List<Integer> lt = Arrays.asList(1,2,3,4,5,6,7,8);

        Optional<Integer> op
                = Optional.of(-1);

        lt.stream().
                filter(e->e>10).findFirst().
                or(()->op).ifPresentOrElse(System.out::println,()->System.out.println("Value not exist"));

        }
}
