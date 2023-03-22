import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;


public class countString{
    public static void cprint() throws Exception
    {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new FileReader("/home/ayush/file.txt"));
        System.out.print("Enter the word: ");
        String word = sc.nextLine();
        int count = 0;

        String line;
        while ((line = br.readLine()) != null) {
            String[] word1 = line.split("\\s+");
            for (String words : word1) {
                if(words.equalsIgnoreCase(word)) count++;
            }
        }
        System.out.println(count);
    }




    public static void main(String[] args) {
        try{
            cprint();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
