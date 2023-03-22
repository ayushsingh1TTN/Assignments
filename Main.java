import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Float> lt = new ArrayList<>();
        lt.add(7.5F);
        lt.add(5.6F);
        lt.add(4.4F);
        lt.add(1.2F);
        lt.add(10.7F);

        float sum=0;
        Iterator<Float> it = lt.iterator();
        while(it.hasNext()){
            Float i = it.next();
            sum+=i;
        }
        System.out.println("The sum of all element in the List is: "+sum);
    }
}