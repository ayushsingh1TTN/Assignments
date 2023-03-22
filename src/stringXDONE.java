import java.util.*;
public class stringXDONE {

    public static void main(String arg[]){
        Scanner input = new Scanner(System.in);
        String s = new String();
        while (true) {
            String line = new String();
            line = input.nextLine();
            if (line.equals("XDONE")) {
                System.out.println(s);
                break;
            }
            s = s+" "+line;
        }

    }

}

