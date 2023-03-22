public class q1 {
    private static String FirstName="Ayush";
    private static String LastName="Singh";
    private static int age=22;

    static{
        System.out.println("This is Static block");
        System.out.println("First name is " +FirstName);
        System.out.println("Last name is "+LastName);
        System.out.println("Age is "+age);
    }

    public static void printValue(){
        System.out.println("This is Static method");
        System.out.println("First name is "+FirstName);
        System.out.println("Last name is "+LastName);
        System.out.println("Age is "+age);
    }
    public static void main(String arg[]){
        q1 q = new q1();
        q1.printValue();

    }
}
