import java.util.*;
public class salarycomparetor implements Comparator<Employee>{

    public int compare(Employee e, Employee e2){
        return Double.compare(e.getSalary(),e2.getSalary());
    }
}
