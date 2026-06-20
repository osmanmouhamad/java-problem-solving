package Problemslvl2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DeleteClientByAccountNumber {

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

    public static String convertRecordToLine(Client client) {
        return client.accountNumber + SEPARATOR
                + client.pinCode + SEPARATOR
                + client.name + SEPARATOR
                + client.phone + SEPARATOR
                + client.accountBalance;
    }

    public static ArrayList<Client> loadClientsDataFromFile(String fileName) {

        ArrayList<Client> clients = new ArrayList<>();

        try {
            File file = new File(fileName);
            Scanner fileReader = new Scanner(file);

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();

                if (!line.trim().isEmpty()) {
                    clients.add(convertLineToRecord(line));
                }
            }

            fileReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }

        return clients;
    }

    public static void saveClientsDataToFile(String fileName, ArrayList<Client> clients) {

        try (FileWriter writer = new FileWriter(fileName, false)) {

            for (Client client : clients) {
                if (!client.markForDelete) {
                    writer.write(convertRecordToLine(client) + System.lineSeparator());
                }
            }

        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }

    public static void printClientCard(Client client) {

        System.out.println("\nThe following are the client details:");
        System.out.println("\nAccount Number : " + client.accountNumber);
        System.out.println("Pin Code       : " + client.pinCode);
        System.out.println("Name           : " + client.name);
        System.out.println("Phone          : " + client.phone);
        System.out.println("Account Balance: " + client.accountBalance);
    }

    public static Client findClientByAccountNumber(String accountNumber, ArrayList<Client> clients) {

        for (Client client : clients) {
            if (client.accountNumber.equals(accountNumber)) {
                return client;
            }
        }

        return null;
    }

    public static boolean markClientForDeleteByAccountNumber(String accountNumber, ArrayList<Client> clients) {

        for (Client client : clients) {
            if (client.accountNumber.equals(accountNumber)) {
                client.markForDelete = true;
                return true;
            }
        }

        return false;
    }

    public static boolean deleteClientByAccountNumber(String accountNumber, ArrayList<Client> clients, Scanner scan) {

        Client client = findClientByAccountNumber(accountNumber, clients);

        if (client != null) {

            printClientCard(client);

            System.out.print("\nAre you sure you want to delete this client? y/n ? ");
            char answer = scan.nextLine().charAt(0);

            if (answer == 'y' || answer == 'Y') {

                markClientForDeleteByAccountNumber(accountNumber, clients);
                saveClientsDataToFile(CLIENTS_FILE_NAME, clients);

                clients.clear();
                clients.addAll(loadClientsDataFromFile(CLIENTS_FILE_NAME));

                System.out.println("\nClient Deleted Successfully.");
                return true;
            }

            return false;
        }

        System.out.println("\nClient with Account Number (" + accountNumber + ") is Not Found!");
        return false;
    }

    public static String readClientAccountNumber(Scanner scan) {
        System.out.print("\nPlease enter Account Number? ");
        return scan.nextLine();
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Client> clients = loadClientsDataFromFile(CLIENTS_FILE_NAME);

        String accountNumber = readClientAccountNumber(scan);

        deleteClientByAccountNumber(accountNumber, clients, scan);

        scan.close();
    }
}