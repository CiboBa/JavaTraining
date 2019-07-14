package exceptionTasks.passwordTask;

public class SpecialCharException extends Exception {

    private final String password;

    public SpecialCharException(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return ("SpecialCharException: " + password);
    }
}
