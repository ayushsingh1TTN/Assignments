import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Consumer<Integer> show = (a)->System.out.println("In consumer interface: "+a);
        show.accept(89);

        Supplier<LocalDateTime> date = ()->LocalDateTime.now();
        System.out.println("Date and time: ");
        System.out.println(date.get());

        Predicate<Integer> Even = (a)->(a%2==0);
        System.out.println("Even Numbers: ");
        System.out.println(Even.test(57));

        Function<Integer,Double> value=(a)->(a*7.0);
        System.out.println("Double value: ");
        System.out.println(value.apply(57));



    }
}