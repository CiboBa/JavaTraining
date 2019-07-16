package dataStructuresTask;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class CcsApp {

    /*
    Read a credit card CSV statement
    Creating a balance variable that calculates the running balance of the user’s account
    If the field says CREDIT, then add the amount to the balance
    If the field says DEBIT, then subtract the amount to the balance
    If the final amount is greater than zero, charge a 10% fee and warn the user
    If the final amount is zero, thank the user for their payments
    If the final amount is less than zero, thank the user for their payment and display their overpayment.
     */
    public static void main(String[] args) {

        ArrayList<String[]> transactions = new ArrayList<String[]>();
        String fileName = "C:\\Users\\Bartek\\IdeaProjects\\JavaTraining\\src\\main\\resources\\Files\\CreditCardStatement";
        File file = new File(fileName);
        String dataRow;
        double balance = 0;
        LinkedHashMap<String, String> operations = new LinkedHashMap<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while ((dataRow = bufferedReader.readLine()) != null) {
                String[] line = dataRow.split(",");
                transactions.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("DATE | TRANSACTION | VENDOR | AMOUNT | CURRENT BALANCE");
        for (String[] transaction : transactions) {
            String date = transaction[0];
            String type = transaction[1];
            String vendor = transaction[2];
            double amount = Double.parseDouble(transaction[3]);
            System.out.print(date + " | " + type + " | " + vendor + " | " + amount + " | ");
            if (type.equalsIgnoreCase("credit")) {
                balance += amount;
            } else if (type.equalsIgnoreCase("debit")) {
                balance -= amount;
            }
            System.out.print(" " + balance + "\n");
        }
        if (balance > 0) {
            balance -= balance * 0.1;
            System.out.println("Warning!!! You are charged 10% of your balance: " + balance * 0.1);
        } else if (balance == 0) {
            System.out.println("Thank you for your payments");
        } else {
            System.out.println("Thank you for your payments. Your overpayment is: " + balance);
        }
    }
}

