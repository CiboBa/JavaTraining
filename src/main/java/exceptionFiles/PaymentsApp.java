package exceptionFiles;

import java.util.Scanner;

public class PaymentsApp {

    /*
    Take a payment from a user
    1. Ask the user for input
    2. Get the amount and test the value
    3. Handle exception appropriately
    4. Print confirmation
    */

    public static void main(String[] args) {

        double payment = 0;
        boolean positivePayment = true;

        do {
            System.out.println("Enter the payment amount: ");

            Scanner scanner = new Scanner(System.in);

            try {
                payment = scanner.nextDouble();
                if (payment < 0) {
                    throw new NegativePaymentException(payment);
                } else {
                    positivePayment = true;
                }
            } catch (NegativePaymentException e) {
                System.out.println(e.toString());
                System.out.println("Please try again");
                positivePayment = false;
            }
        } while (!positivePayment);
        System.out.println("Thank you for your payment $" + payment);
    }
}
