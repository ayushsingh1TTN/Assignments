record student(String name, int age){

    student(String name, int age) {

        this.name = name;
        this.age = age;

    }


    public int count() {
        int count=0;
        return ++count;
    }

    @Override
    public int age() {
        return age;
    }
}
public class Student {
    public static void main(String[] args) {
        student s1 = new student("Ayush", 22);
        student s2 = new student("ritik", 23);

        System.out.println(s1.equals(s2));

    }


}
