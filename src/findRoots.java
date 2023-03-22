public class findRoots {

    public static void roots(int d, int b, int a){
        if(d<0) System.out.println("Imaginary roots");
        else{
        double r1 = (-b + Math.sqrt(d))/2*a;
        double r2 = (-b - Math.sqrt(d))/2*a;
        System.out.println(r1+ " " + r2);
        }

    }

    public static void main(String arg[]){
        int a=2;
        int b=4;
        int c=1;

        int d=(b*b)-4*a*c;
        roots(d, b, a);
    }

}
