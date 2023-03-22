import java.util.*;
public class Employee implements Comparable<Employee>{
    public String name;
    private double age,salary;

    public Employee(String name, double age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int compareTo(Employee o){
        String[] thisname=this.name.split(" ");
        String[] oname=o.name.split(" ");
        int c=thisname[0].compareTo(oname[0]);
        if(c!=0) return c;
        else return thisname[1].compareTo(oname[1]);
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }


}
