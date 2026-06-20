package Problemslvl2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ClientsList {

    static final String CLIENTS_FILE_NAME = "Clients.txt";
    static final String SEPARATOR = "#//#";

    static class Client {
        String accountNumber;
        String pinCode;
        String name;
        String phone;
        double accountBalance;
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

    public static ArrayList<Client> loadClientsDataFromFile(String fileName) {

        ArrayList<Client> clients = new ArrayList<>();

        try {
            File file = new File(fileName);
            Scanner fileReader = new Scanner(file);

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();

                if (!line.trim().isEmpty()) {
                    Client client = convertLineToRecord(line);
                    clients.add(client);
                }
            }

            fileReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }

        return clients;
    }

    public static void printClientRecord(Client client) {
        System.out.printf("| %-15s", client.accountNumber);
        System.out.printf("| %-10s", client.pinCode);
        System.out.printf("| %-40s", client.name);
        System.out.printf("| %-12s", client.phone);
        System.out.printf("| %-12.2f", client.accountBalance);
    }

    public static void printAllClientsData(ArrayList<Client> clients) {

        System.out.println("\n\t\t\t\t\tClient List (" + clients.size() + ") Client(s).");

        System.out.println("______________________________________________________________________________________________\n");

        System.out.printf("| %-15s", "Account Number");
        System.out.printf("| %-10s", "Pin Code");
        System.out.printf("| %-40s", "Client Name");
        System.out.printf("| %-12s", "Phone");
        System.out.printf("| %-12s", "Balance");

        System.out.println("\n______________________________________________________________________________________________\n");

        for (Client client : clients) {
            printClientRecord(client);
            System.out.println();
        }

        System.out.println("\n______________________________________________________________________________________________");
    }

    public static void main(String[] args) {

        ArrayList<Client> clients = loadClientsDataFromFile(CLIENTS_FILE_NAME);

        printAllClientsData(clients);
    }
}