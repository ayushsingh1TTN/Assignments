import java.util.function.Supplier;

@FunctionalInterface
interface MyFunctionalInterface1 {

    Student getStudent();
}
class Student {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class ConstructorReferenceDemo {
    public static void main(String[] args) {

        MyFunctionalInterface1 mf = Student::new;

        Supplier<Student> s1 = Student::new;
        Supplier<Student> s2 = () -> new Student();

        System.out.println(mf.getStudent());
        System.out.println(s1.get());
    }
}
