import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ContactsController {


    public static int mainMenu(){

        System.out.println("1. View contacts.");
        System.out.println("2. Add a new contact.");
        System.out.println("3. Search a contact by name.");
        System.out.println("4. Delete an existing contact.");
        System.out.println("5. Exit.");
        System.out.println("Enter an option (1, 2, 3, 4 or 5):");

        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        return userInput;

        }

    public static void viewList() {
        System.out.println("Name | Phone Number");
        Path ContactsPath = Paths.get("data", "contacts.txt");
        List<String> Personlist = null;
        try{
            Personlist = Files.readAllLines(ContactsPath);
        } catch (IOException e){
            e.printStackTrace();
        }
        for(int i = 0; i < Personlist.size(); i += 1){
            System.out.println((i + 1) + ": " + Personlist.get(i));
        }
    }

    public static void addContact() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("2. Add a new contact.");
        System.out.println("Enter First name.");
        String firstName = sc.nextLine();
        System.out.println("Enter Last name.");
        String lastName = sc.nextLine();
        System.out.println("Enter phone number.");
        String phoneNumber = sc.nextLine();
        Files.write(Paths.get("data", "contacts.txt"),
                Arrays.asList(firstName + " " + lastName + " | " + phoneNumber),
                StandardOpenOption.APPEND);
                //System.out.println(firstName + " " + lastName + " | " + phoneNumber);
                viewList();
    }

    public static void searchContact() {
        System.out.println("3. Search a contact by name.");
        System.out.println("Enter First or Last name.");
        Scanner sc = new Scanner(System.in);
        String searchedName = sc.nextLine();
        Path ContactsPath = Paths.get("data", "contacts.txt");
        List<String> Personlist;
        try{
            Personlist = Files.readAllLines(ContactsPath);
            for (String person : Personlist){
                if(person.toLowerCase().contains(searchedName.toLowerCase())){
                    System.out.println("Contact: \n" + person);
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void deleteContact() {
        System.out.println("4. Delete existing contact.");
        System.out.println("Name or Number: ");
        Scanner sc = new Scanner(System.in);
        String deleteName = sc.nextLine();
        Path ContactsPath = Paths.get("data", "contacts.txt");
        List<String> Personlist;
        try {
            Personlist = Files.readAllLines(ContactsPath);
            List<String> newList = new ArrayList<>();
            for (String person : Personlist) {
                if (person.toLowerCase().contains(deleteName)) {
                }
                newList.add(person);
            }
            for (String name : newList) {
                System.out.println(name);
            }

            Path test = Paths.get("./data", "contacts.txt");
            Files.write(test, Arrays.asList("example - 555555555")); //a path with a thing to write - usually an arraylist or otherwise
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void exit() {
            System.out.println("Adios!");
            System.exit(0);
    }
}

    