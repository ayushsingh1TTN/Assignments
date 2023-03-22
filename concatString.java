interface concat{
    String method(String a, String b);
}
public class concatString {
    public static void main(String[] args) {
        concat ct = (String a, String b) -> {return a.concat(b);};
        System.out.println("Concat the string: "+ct.method("Ayush", "Singh"));
    }
}
