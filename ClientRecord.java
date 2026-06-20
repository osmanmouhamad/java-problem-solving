package Problemslvl2;

import java.util.Scanner;

public class ClientRecord {

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

        String separator = "#//#";

        String clientRecord = "";

        clientRecord += client.accountNumber + separator;
        clientRecord += client.pinCode + separator;
        clientRecord += client.name + separator;
        clientRecord += client.phone + separator;
        clientRecord += client.accountBalance;

        return clientRecord;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter Client Data:\n");

        Client client = readNewClient(scan);

        System.out.println("\nClient Record for Saving is:\n");
        System.out.println(convertRecordToLine(client));

        scan.close();
    }
}