package lab2tasks;

public class Student extends StudentAddress {

    private static String iD = "007";
    private String name;
    private String ssn;
    private String email;
    private double balance = 2000;


    Student(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
        System.out.println("Student was added: " + name + " " + ssn);
    }

    public void setName() {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSsn() {
        this.ssn = ssn;
    }

    public String getSsn() {
        return ssn;
    }

    void setEmail() {
        email = name + "@fake-email.gov";
        System.out.println("Email: " + email);
    }

    public String getEmail() {
        return email;
    }

    void userID() {
        int random = (int) (Math.random() * ((9000 - 1000) + 1));
        String userID = iD + " " + random + " " + ssn.substring(3, 8);
        System.out.println("User ID: " + userID);
    }

    void enroll(String courseName) {
        System.out.println("You've been enrolled to a course: " + courseName);
    }

    void pay(double amount) {
        System.out.println("Payed: $" + amount);
        balance -= amount;
    }

    void checkBalance() {
        System.out.println("Your balance is: " + balance);
    }

    @Override
    public String toString() {
        return "[Name: " + name + "] \n" +
                "[SSN: " + ssn + "]\n" +
                "[Email: " + email + "]\n" +
                "[Balance: " + balance + "]";
    }

    void showCourses() {
        System.out.println("-Course 1\n-Course 2\n-Course 3");
    }
}
