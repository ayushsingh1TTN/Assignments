import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class employe{
    String name, city;
    long salary;

    public employe(String name, String city, long salary) {
        this.name = name;
        this.city = city;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public long getSalary() {
        return salary;
    }
}
public class q4 {
    public static void main(String[] args) {
        List<employe> lt = Arrays.asList(new employe("Ayush Singh", "Delhi", 678976),
                new employe("Ritik Kumar", "Jabalpur", 6789876),
                new employe("Rishi Sharma", "Bhopal", 5676543));

        Optional<employe> em = lt.stream().filter(e->e.getCity().equalsIgnoreCase("Bhopal")).
                findFirst();
        if(em.isPresent()){
            System.out.println("Name: "+em.get().getName()+" City: "+em.get().getCity());
        }
        else System.out.println("Not found");
    }
}
