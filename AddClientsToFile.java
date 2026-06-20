package Problemslvl2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddClientsToFile {

    static final String CLIENTS_FILE_NAME = "Clients.txt";
    static final String SEPARATOR = "#//#";

    static class Client {
        String accountNumber;
        String pinCode;
        String name;
        String phone;
        double accountBalance;
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

        String clientRecord = "";

        clientRecord += client.accountNumber + SEPARATOR;
        clientRecord += client.pinCode + SEPARATOR;
        clientRecord += client.name + SEPARATOR;
        clientRecord += client.phone + SEPARATOR;
        clientRecord += client.accountBalance;

        return clientRecord;
    }

    public static void addDataLineToFile(String fileName, String dataLine) {

        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(dataLine + System.lineSeparator());
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }

    public static void addNewClient(Scanner scan) {

        Client client = readNewClient(scan);
        String line = convertRecordToLine(client);

        addDataLineToFile(CLIENTS_FILE_NAME, line);
    }

    public static void addClients(Scanner scan) {

        char addMore = 'Y';

        do {
            System.out.println("\nAdding New Client:\n");

            addNewClient(scan);

            System.out.print("\nClient Added Successfully, do you want to add more clients? Y/N? ");
            addMore = scan.nextLine().charAt(0);

        } while (Character.toUpperCase(addMore) == 'Y');
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        addClients(scan);

        scan.close();
    }
}