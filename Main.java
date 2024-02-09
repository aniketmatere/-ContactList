
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Contacts> c = new ArrayList<>();
        do {
            System.out.println("1. Add Contact ");
            System.out.println("2. Delete Phone Number ");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display List of the Contacts");
            System.out.println("5. Exit");
            System.out.println("Please enter your Choice : ");
            String choice = sc.next();
            choice = choice.toLowerCase();

            switch (choice) {
                case "1" -> {
                    System.out.println("Enter the name : ");
                    sc.nextLine();
                    String name = sc.next();
                    System.out.println("Enter the Contacts (comma-separated) : ");
                    sc.nextLine();
                    String temp = sc.nextLine();
                    String[] contactsArray = temp.split(", ");
                    List<String> contactsList = List.of(contactsArray);
                    Contacts c1 = new Contacts(name, contactsList);
                    c1.addPhoneNumber(name, contactsList);

                    contactsList = Mobile.AddContact(contactsList, c1);
                }

                case "2" -> {
                    System.out.println("Enter name to delete : ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.println("Enter the contact to delete : ");
                    sc.nextLine();
                    String contactToDelete = sc.nextLine();
                }
                default -> System.out.println("Enter valid choice");
            }

            System.out.println("Do you want to continue ?? (y/n)");
            sc.nextLine();
        } while (sc.nextLine().equals("y"));
    }
}
