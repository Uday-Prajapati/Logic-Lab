import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class UserInterface {

    public String findPetName(String fileName) {

        try (FileReader fr = new FileReader(fileName);
             BufferedReader br = new BufferedReader(fr)) {

            String name;

            while ((name = br.readLine()) != null) {
                int vowelCount = 0;

                for (int i = 0; i < name.length(); i++) {
                    char ch = Character.toLowerCase(name.charAt(i));

                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowelCount++;
                    }
                }

                if (vowelCount == 2) {
                    return name;   // return first name with exactly 2 vowels
                }
            }

        } catch (FileNotFoundException e) {
            return "Please give the correct file name";
        } catch (IOException e) {
            return "Error occurred while reading the names from file";
        }

        return "";
    }

    public static void main(String args[]) {
        String fileName = "FindingPetName/inputfeed.txt";  
        UserInterface ui = new UserInterface();
        System.out.println(ui.findPetName(fileName));
    }
}
