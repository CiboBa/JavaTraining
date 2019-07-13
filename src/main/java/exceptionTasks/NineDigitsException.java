package exceptionTasks;

public class NineDigitsException extends Exception {

    private final String phoneNumber;

    NineDigitsException(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return ("NineDigitsException: " + phoneNumber);
    }
}
