package exceptionFiles;

public class NegativePaymentException extends Exception {

    double payment;

    public NegativePaymentException(double payment) {
        this.payment = payment;
        System.out.println("ERROR: negative payment");
    }

    @Override
    public String toString() {
        return "ERROR: Cannot take negative payment: " + payment;
    }
}
