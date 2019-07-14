package exceptionTasks.passwordTask;

public class LetterException extends Exception {

    private final String password;

    public LetterException(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return ("LetterException: " + password);
    }
}
