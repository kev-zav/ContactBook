import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Contact> contacts = new ArrayList<>();
        boolean running = true;
        Scanner scanner = new Scanner(System.in);

        while (running) {
            System.out.println("1. View all contacts.");
            System.out.println("2. Add a contact.");
            System.out.println("3. Search a contact.");
            System.out.println("4. Remove a contact.");
            System.out.println("5. Exit.");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    for (Contact c : contacts) {
                        c.viewContact();
                    }
                    break;

                case 2:
                    System.out.println("Enter contact name: ");
                    String name = scanner.nextLine();

                    System.out.println("Enter contact phone number: ");
                    String phoneNumber = scanner.nextLine();

                    System.out.println("Enter contact email address: ");
                    String email = scanner.nextLine();

                    Contact newContact = new Contact(name, phoneNumber, email);
                    contacts.add(newContact);
                    break;
            }
        }

        scanner.close();
    }
}