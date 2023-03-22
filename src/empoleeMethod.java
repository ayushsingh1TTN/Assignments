import java.util.*;
public class empoleeMethod {
    private String firstname, lastname, designation;
    private int age;

    public empoleeMethod(){
        //default contrustor
        firstname="Atul";
        lastname="Sharma";
        designation="Software Engineer";
        age = 22;
    }
    public empoleeMethod(String firstname, String lastname, String designation, int age){
        //paramterized contructor
        this.firstname=firstname;
        this.lastname=lastname;
        this.designation=designation;
        this.age=age;
    }
    public void setFirstname(String firstname){
        this.firstname=firstname;
    }
    public void setLastname(String lastname){
        this.lastname=lastname;
    }
    public void setDesignation(String designation){
        this.designation=designation;
    }
    public void setAge(int age){
        this.age=age;
    }

    public String getFirstname(){
        return firstname;
    }
    public String getLastname(){
        return lastname;
    }
    public String getDesignation(){
        return designation;
    }
    public int getAge(){
        return age;
    }

    public void display(){
        System.out.println("First name "+firstname);
        System.out.println("Last name "+lastname);
        System.out.println("Designation "+designation);
        System.out.println("Age "+age);
    }

    public String toString(){
        return firstname+" "+lastname;
    }

    public static void main(String arg[]){
        empoleeMethod e = new empoleeMethod();
        e.display();
        e.setFirstname("Arjun");
        e.setLastname("Yadav");
        e.setDesignation("Project Manager");
        e.setAge(22);
        System.out.println("get function of fistname "+e.getFirstname());
        System.out.println("gget function of lastname "+e.getLastname());
        System.out.println("get function of designation "+e.getDesignation());
        System.out.println("get function of age "+e.getAge());
        empoleeMethod em = new empoleeMethod("Arjun", "Yadav", "Project Manager", 22);
        em.display();
        System.out.println("To String function "+em.toString());
    }
}
