interface stringManipulation{
    private static String reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }

    static String toUpper(String s){
        String str = s.toUpperCase();
        return reverse(str);
    }
}
public class Main {
    public static void main(String[] args) {

        System.out.println(stringManipulation.toUpper("Ayush"));

    }
}