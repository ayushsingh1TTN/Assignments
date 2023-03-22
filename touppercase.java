interface uppercase{
    String upper(String a);
}
public class touppercase {
    public static void main(String[] args) {
        uppercase uc = (String a) -> {return a.toUpperCase();};
        System.out.println("The String is converted to upper case: "+uc.upper("abcdefgh"));
    }
}
