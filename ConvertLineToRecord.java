package Problemslvl2;

import java.util.Scanner;

public class ConvertLineToRecord {

    static class Client {
        String accountNumber;
        String pinCode;
        String name;
        String phone;
        double accountBalance;
    }

    public static Client convertLineToRecord(String line) {

        String[] data = line.split("#//#");

        Client client = new Client();

        client.accountNumber = data[0];
        client.pinCode = data[1];
        client.name = data[2];
        client.phone = data[3];
        client.accountBalance = Double.parseDouble(data[4]);

        return client;
    }

    public static void printClientRecord(Client client) {

        System.out.println("\nClient Record:");
        System.out.println("Account Number : " + client.accountNumber);
        System.out.println("Pin Code       : " + client.pinCode);
        System.out.println("Name           : " + client.name);
        System.out.println("Phone          : " + client.phone);
        System.out.println("Balance        : " + client.accountBalance);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Client Record Line: ");
        String line = scan.nextLine();

        Client client = convertLineToRecord(line);

        printClientRecord(client);

        scan.close();
    }
}