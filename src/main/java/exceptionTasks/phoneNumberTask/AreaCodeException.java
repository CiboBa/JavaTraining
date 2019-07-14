package exceptionTasks.phoneNumberTask;

public class AreaCodeException extends Exception {

    private final String phoneNumber;

    AreaCodeException(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return ("AreaCodeException: " + phoneNumber);
    }
}
