import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class q9 {
    public static void main(String[] args) {
        List<Integer> lt = Stream.of(1,2,3,4,5,6,7,8,9).collect(Collectors.toUnmodifiableList());
        System.out.println(lt);
        lt.add(12);

    }
}
