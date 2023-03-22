import java.util.Arrays;
import java.util.List;

public class q3 {
    public static void main(String[] args) {
        List<Integer> lt = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Integer sum = lt.stream().filter(e->e>5).reduce(0, Integer::sum);
        System.out.println("The sum of Number greater than 5 is: "+sum);
    }
}
