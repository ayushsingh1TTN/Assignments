import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class emplo{

    String name, city;
    long salary;

    public emplo(String name, String city, long salary) {
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
public class q5 {

    public static void main(String[] args) {
        List<emplo> lt = Arrays.asList(new emplo("Ayush Singh", "Delhi", 678976),
                new emplo("Ritik Kumar", "Delhi", 4789),
                new emplo("Rishi Sharma", "Bhopal", 5676));

        List<String> unique=lt.stream().filter(e->e.getSalary()<5000 && e.getCity().
                equalsIgnoreCase("Delhi")).map(e->e.getName().split("\\s+")[0]).distinct()
                .collect(Collectors.toList());

        System.out.println(unique);

    }
}