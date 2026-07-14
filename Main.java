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

                case 3: 
                    System.out.println("Enter a contact to search: ");
                    String contactSearched = scanner.nextLine();
                    boolean found = false;
                    for (Contact c : contacts) {
                        if (contactSearched.equals(c.getName())) {
                            found = true;
                            c.viewContact();
                        }
                    }
                    if (!found) {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 4: 
                    System.out.println("Enter a contact to remove");
                    String contactRemove = scanner.nextLine();
                    boolean found2 = false;
                    Contact toRemove = null;
                    for (Contact c : contacts) {
                        if (contactRemove.equals(c.getName())) {
                            found2 = true;
                            toRemove = c;
                        }
                    }
                    if (!found2) {
                        System.out.println("Contact not found.");
                    }
                    contacts.remove(toRemove);
                    break;

                case 5: 
                    running = false;
                    break;
                    
            }
        }
        scanner.close();
        }
    }

    