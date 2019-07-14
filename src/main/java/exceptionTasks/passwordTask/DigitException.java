package exceptionTasks.passwordTask;

class DigitException extends Exception {

    private final String password;


    DigitException(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return ("DigitException: " + password);
    }
}
