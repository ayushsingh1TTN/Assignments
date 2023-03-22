import java.util.HashMap;
import java.util.Map;

public class employee {
    private String name, designation;
    private int age;

    public employee(String name, String designation, int age) {
        this.name = name;
        this.designation = designation;
        this.age = age;
    }
    public String getDetails(){
        return "Name: "+name+" Designation: "+designation+" Age: "+age;
    }

    public static void main(String[] args) {
        Map<employee, Integer> mp = new HashMap<>();
        employee a = new employee("Aryan Singh","Product Manager", 34);
        employee b = new employee("Ayush Singh","Developer", 22);
        employee c = new employee("Rohit Yadav","Sales Manager", 26);
        employee d = new employee("Ujjwal Agarwal","Senior Developer", 23);
        mp.put(a,234324);
        mp.put(b,564566);
        mp.put(c,8756836);
        mp.put(d,6482649);

        for(Map.Entry<employee, Integer> entry:mp.entrySet()){
            System.out.println(entry.getKey().getDetails()+" earns "+entry.getValue());
        }
    }
}
