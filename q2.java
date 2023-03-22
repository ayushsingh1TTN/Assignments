interface Employee{
    String getname();
    long getsalary();
    String getcity();
    default void print(){
        System.out.println("Name: "+getname());
        System.out.println("Salary: "+getsalary());
        System.out.println("City: "+getcity());
    }

    static void info(){
        System.out.println("Static method is called");
    }

}
class manager implements Employee{
    String name, city;
    long salary;

    public manager(String name, String city, long salary) {
        this.name = name;
        this.city = city;
        this.salary = salary;
    }

    @Override
    public String getname() {
        return name;
    }

    @Override
    public long getsalary() {
        return salary;
    }

    @Override
    public String getcity() {
        return city;
    }
}
public class q2 {
    public static void main(String[] args) {
        manager m = new manager("Ayush Singh", "Jaipur", 56789342);
        m.print();
        Employee.info();
    }
}
