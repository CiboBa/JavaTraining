package exceptionTasks.phoneNumberTask;

public class EmergencyNumberException extends Exception {

    private final String phoneNumber;

    EmergencyNumberException(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return ("EmergencyNumberException: " + phoneNumber);
    }
}
