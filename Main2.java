import java.util.*;
public class Main2 {
    public static void main(String[] args) {
        List<Employee> em = new ArrayList<>();
        em.add(new Employee("Ayush Singh", 23, 6574548));
        em.add(new Employee("Aryan Singh", 22, 65745345));
        em.add(new Employee("Ujjwal Agarwal", 25, 657454353));
        em.add(new Employee("Rohit Yadav", 23, 657454545));

        Collections.sort(em);
        for(Employee e : em){
            System.out.println(e.getName()+" "+e.getAge()+" "+e.getSalary());
        }
        Collections.sort(em, new salarycomparetor());

        System.out.println("\nSorting on the bases of Salary: \n");
        for(Employee e: em){
            System.out.println(e.getName()+" "+e.getAge()+" "+e.getSalary());
        }
    }
}
