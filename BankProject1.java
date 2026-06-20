package Problemslvl2;

import java.io.*;
import java.util.*;

public class BankProject1 {

    static final String CLIENTS_FILE_NAME = "Clients.txt";
    static final String SEPARATOR = "#//#";
    static class Client {
        String accountNumber;
        String pinCode;
        String name;
        String phone;
        double accountBalance;
        boolean markForDelete = false;
    }

    public static Client readNewClient(Scanner scan) {
        Client client = new Client();

        System.out.print("Enter Account Number? ");
        client.accountNumber = scan.nextLine();

        System.out.print("Enter PinCode? ");
        client.pinCode = scan.nextLine();

        System.out.print("Enter Name? ");
        client.name = scan.nextLine();

        System.out.print("Enter Phone? ");
        client.phone = scan.nextLine();

        System.out.print("Enter Account Balance? ");
        client.accountBalance = Double.parseDouble(scan.nextLine());

        return client;
    }

    public static String convertRecordToLine(Client client) {
        return client.accountNumber + SEPARATOR
                + client.pinCode + SEPARATOR
                + client.name + SEPARATOR
                + client.phone + SEPARATOR
                + client.accountBalance;
    }

    public static Client convertLineToRecord(String line) {
        String[] data = line.split(SEPARATOR);

        Client client = new Client();
        client.accountNumber = data[0];
        client.pinCode = data[1];
        client.name = data[2];
        client.phone = data[3];
        client.accountBalance = Double.parseDouble(data[4]);

        return client;
    }

    public static ArrayList<Client> loadClientsDataFromFile() {
        ArrayList<Client> clients = new ArrayList<>();

        try {
            File file = new File(CLIENTS_FILE_NAME);
            Scanner fileReader = new Scanner(file);

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();

                if (!line.trim().isEmpty()) {
                    clients.add(convertLineToRecord(line));
                }
            }

            fileReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found, it will be created when adding clients.");
        }

        return clients;
    }

    public static void saveClientsDataToFile(ArrayList<Client> clients) {
        try (FileWriter writer = new FileWriter(CLIENTS_FILE_NAME, false)) {

            for (Client client : clients) {
                if (!client.markForDelete) {
                    writer.write(convertRecordToLine(client) + System.lineSeparator());
                }
            }

        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }

    public static void addDataLineToFile(String line) {
        try (FileWriter writer = new FileWriter(CLIENTS_FILE_NAME, true)) {
            writer.write(line + System.lineSeparator());
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }

    public static void printClientRecordLine(Client client) {
        System.out.printf("| %-15s", client.accountNumber);
        System.out.printf("| %-10s", client.pinCode);
        System.out.printf("| %-40s", client.name);
        System.out.printf("| %-12s", client.phone);
        System.out.printf("| %-12.2f", client.accountBalance);
    }

    public static void showAllClientsScreen() {
        ArrayList<Client> clients = loadClientsDataFromFile();

        System.out.println("\n\t\t\t\t\tClient List (" + clients.size() + ") Client(s).");
        System.out.println("______________________________________________________________________________________________\n");

        System.out.printf("| %-15s", "Account Number");
        System.out.printf("| %-10s", "Pin Code");
        System.out.printf("| %-40s", "Client Name");
        System.out.printf("| %-12s", "Phone");
        System.out.printf("| %-12s", "Balance");

        System.out.println("\n______________________________________________________________________________________________\n");

        if (clients.isEmpty()) {
            System.out.println("\t\t\tNo Clients Available In the System!");
        } else {
            for (Client client : clients) {
                printClientRecordLine(client);
                System.out.println();
            }
        }

        System.out.println("\n______________________________________________________________________________________________");
    }

    public static void printClientCard(Client client) {
        System.out.println("\nThe following are the client details:");
        System.out.println("-----------------------------------");
        System.out.println("Account Number : " + client.accountNumber);
        System.out.println("Pin Code       : " + client.pinCode);
        System.out.println("Name           : " + client.name);
        System.out.println("Phone          : " + client.phone);
        System.out.println("Account Balance: " + client.accountBalance);
        System.out.println("-----------------------------------");
    }

    public static Client findClientByAccountNumber(String accountNumber, ArrayList<Client> clients) {
        for (Client client : clients) {
            if (client.accountNumber.equals(accountNumber)) {
                return client;
            }
        }
        return null;
    }

    public static String readClientAccountNumber(Scanner scan) {
        System.out.print("\nPlease enter Account Number? ");
        return scan.nextLine();
    }

    public static Client changeClientRecord(String accountNumber, Scanner scan) {
        Client client = new Client();

        client.accountNumber = accountNumber;

        System.out.print("\nEnter PinCode? ");
        client.pinCode = scan.nextLine();

        System.out.print("Enter Name? ");
        client.name = scan.nextLine();

        System.out.print("Enter Phone? ");
        client.phone = scan.nextLine();

        System.out.print("Enter Account Balance? ");
        client.accountBalance = Double.parseDouble(scan.nextLine());

        return client;
    }

    public static void addNewClient(Scanner scan) {
        Client client = readNewClient(scan);
        addDataLineToFile(convertRecordToLine(client));
    }

    public static void addNewClients(Scanner scan) {
        char addMore;

        do {
            System.out.println("\nAdding New Client:\n");

            addNewClient(scan);

            System.out.print("\nClient Added Successfully, do you want to add more clients? Y/N? ");
            addMore = scan.nextLine().charAt(0);

        } while (Character.toUpperCase(addMore) == 'Y');
    }

    public static boolean deleteClientByAccountNumber(String accountNumber, ArrayList<Client> clients, Scanner scan) {
        Client client = findClientByAccountNumber(accountNumber, clients);

        if (client == null) {
            System.out.println("\nClient with Account Number (" + accountNumber + ") is Not Found!");
            return false;
        }

        printClientCard(client);

        System.out.print("\nAre you sure you want delete this client? y/n ? ");
        char answer = scan.nextLine().charAt(0);

        if (answer == 'y' || answer == 'Y') {
            client.markForDelete = true;
            saveClientsDataToFile(clients);

            System.out.println("\nClient Deleted Successfully.");
            return true;
        }

        return false;
    }

    public static boolean updateClientByAccountNumber(String accountNumber, ArrayList<Client> clients, Scanner scan) {
        Client client = findClientByAccountNumber(accountNumber, clients);

        if (client == null) {
            System.out.println("\nClient with Account Number (" + accountNumber + ") is Not Found!");
            return false;
        }

        printClientCard(client);

        System.out.print("\nAre you sure you want update this client? y/n ? ");
        char answer = scan.nextLine().charAt(0);

        if (answer == 'y' || answer == 'Y') {
            for (int i = 0; i < clients.size(); i++) {
                if (clients.get(i).accountNumber.equals(accountNumber)) {
                    clients.set(i, changeClientRecord(accountNumber, scan));
                    break;
                }
            }

            saveClientsDataToFile(clients);
            System.out.println("\nClient Updated Successfully.");
            return true;
        }

        return false;
    }

    public static void showDeleteClientScreen(Scanner scan) {
        System.out.println("\n-----------------------------------");
        System.out.println("\tDelete Client Screen");
        System.out.println("-----------------------------------");

        ArrayList<Client> clients = loadClientsDataFromFile();
        String accountNumber = readClientAccountNumber(scan);

        deleteClientByAccountNumber(accountNumber, clients, scan);
    }

    public static void showUpdateClientScreen(Scanner scan) {
        System.out.println("\n-----------------------------------");
        System.out.println("\tUpdate Client Info Screen");
        System.out.println("-----------------------------------");

        ArrayList<Client> clients = loadClientsDataFromFile();
        String accountNumber = readClientAccountNumber(scan);

        updateClientByAccountNumber(accountNumber, clients, scan);
    }

    public static void showAddNewClientsScreen(Scanner scan) {
        System.out.println("\n-----------------------------------");
        System.out.println("\tAdd New Clients Screen");
        System.out.println("-----------------------------------");

        addNewClients(scan);
    }

    public static void showFindClientScreen(Scanner scan) {
        System.out.println("\n-----------------------------------");
        System.out.println("\tFind Client Screen");
        System.out.println("-----------------------------------");

        ArrayList<Client> clients = loadClientsDataFromFile();
        String accountNumber = readClientAccountNumber(scan);

        Client client = findClientByAccountNumber(accountNumber, clients);

        if (client != null) {
            printClientCard(client);
        } else {
            System.out.println("\nClient with Account Number [" + accountNumber + "] is not found!");
        }
    }

    public static void showEndScreen() {
        System.out.println("\n-----------------------------------");
        System.out.println("\tProgram Ends :-)");
        System.out.println("-----------------------------------");
    }

    public static void goBackToMainMenu(Scanner scan) {
        System.out.print("\nPress Enter to go back to Main Menu...");
        scan.nextLine();
    }

    public static int readMainMenuOption(Scanner scan) {
        System.out.print("Choose what do you want to do? [1 to 6]? ");
        return Integer.parseInt(scan.nextLine());
    }

    public static void performMainMenuOption(int choice, Scanner scan) {
        switch (choice) {
            case 1:
                showAllClientsScreen();
                goBackToMainMenu(scan);
                break;

            case 2:
                showAddNewClientsScreen(scan);
                goBackToMainMenu(scan);
                break;

            case 3:
                showDeleteClientScreen(scan);
                goBackToMainMenu(scan);
                break;

            case 4:
                showUpdateClientScreen(scan);
                goBackToMainMenu(scan);
                break;

            case 5:
                showFindClientScreen(scan);
                goBackToMainMenu(scan);
                break;

            case 6:
                showEndScreen();
                break;

            default:
                System.out.println("Invalid choice!");
                goBackToMainMenu(scan);
        }
    }

    public static void showMainMenu(Scanner scan) {
        int choice;

        do {
            System.out.println("\n===========================================");
            System.out.println("\t\tMain Menu Screen");
            System.out.println("===========================================");
            System.out.println("\t[1] Show Client List.");
            System.out.println("\t[2] Add New Client.");
            System.out.println("\t[3] Delete Client.");
            System.out.println("\t[4] Update Client Info.");
            System.out.println("\t[5] Find Client.");
            System.out.println("\t[6] Exit.");
            System.out.println("===========================================");

            choice = readMainMenuOption(scan);
            performMainMenuOption(choice, scan);

        } while (choice != 6);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        showMainMenu(scan);

        scan.close();
    }
}