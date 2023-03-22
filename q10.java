public class q10 {
    public static void main(String[] args) {
        String a = "HELLO ";
        System.out.println("Repeat the string n times: "+a.repeat(5));
        System.out.println("Strip the String: "+a.strip());
        System.out.println("Check if the String is blank or not: "+a.isBlank());
        System.out.println("Add spaces in front of the String: "+a.indent(4));
        System.out.println("Remove spaces in front of the String: "+a.indent(-3));

        String returnstring = a.transform(string -> new StringBuilder(string).reverse().toString());
        System.out.println("Use of Tranform: "+returnstring);
        System.out.println("Remove space from starting and from the end: "+a.stripIndent());

        System.out.println("Use of Translate Escape: "+a.translateEscapes());
        System.out.println(a.formatted(22));
    }
}
