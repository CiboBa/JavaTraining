package lab2tasks;

public class Student {

    private static int iD = 700;
    private String userId;
    private String name;
    private String ssn;
    private String email;
    private int balance = 2000;
    private String courses = "";
    private static int courseCost = 800;

    private String phone;
    private String city;
    private String state;

    Student(String name, String ssn) {
        iD++;
        this.name = name;
        this.ssn = ssn;
        setUserId();
        setEmail();
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
        email = name.toLowerCase() + "." + iD + "@fake-email.gov";
        System.out.println("Email: " + email);
    }

    public String getEmail() {
        return email;
    }

    private void setUserId() {
        int min = 1000;
        int max = 9000;
        int random = (int) (Math.random() * ((max - min) + 1));
        userId = iD + " " + random + " " + ssn.substring(4, 8);
    }

    void enroll(String courseName) {
        this.courses = this.courses + "\n" + courseName;
        pay(courseCost);
    }

    void pay(int amount) {
        System.out.println("Payed: $" + amount);
        balance -= amount;
    }

    void checkBalance() {
        System.out.println("Your balance is: " + balance);
    }

    @Override
    public String toString() {
        return "[User ID:" + userId + "]\n" +
                "[Name: " + name + "] \n" +
                "[SSN: " + ssn + "]\n" +
                "[Email: " + email + "]\n" +
                "[Balance: " + balance + "]\n" +
                "[ID: " + iD + "]";
    }

    void showCourses() {
        System.out.println(courses);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
