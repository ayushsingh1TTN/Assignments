import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class userCreator{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        try (FileWriter fw = new FileWriter("/home/ayush/file.txt", true)){

            while(true){

                System.out.print("Enter First name: ");
                String firstname = sc.nextLine();

                System.out.print("Enter Last name: ");
                String lastname = sc.nextLine();

                System.out.print("Enter the age: ");
                int age = sc.nextInt();

                System.out.print("Enter the phone number: ");
                int phonenumber = sc.nextInt();
                user u = new user(firstname,lastname,age,phonenumber);

                fw.write(u+"\n");
                System.out.print("Do you want to continue creating users? (Type QUIT to exit) ");
                String input = sc.next();
                if(input.equalsIgnoreCase("QUIT")) {break;}
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
