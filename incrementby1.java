interface by1{
    int number(int a);
}
public class incrementby1 {
    public static void main(String[] args) {
        by1 by = (a) -> {return ++a;};
        System.out.println("The number is incremented by one: "+by.number(4));
    }
}
