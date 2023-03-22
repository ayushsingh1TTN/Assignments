interface operate{
    int Operate(int a, int b);
}
public class calculate {

    int add(int a, int b){
        return a+b;
    }
    int sub(int a, int b){
        return a-b;
    }
    static int multi(int a, int b){
        return a*b;
    }

    public static void main(String[] args) {

        operate op = new calculate()::add;
        operate op1 = new calculate()::sub;

        operate op2 = calculate::multi;

        System.out.println(op.Operate(5,6));
        System.out.println(op1.Operate(8,5));
        System.out.println(op2.Operate(6,5));

    }

}
