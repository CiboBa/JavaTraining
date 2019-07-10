package lab2tasks;

public class StudentApp {

    /*
  Create a Student Database with the following attributes:
- New Student constructor that takes name and SSN in the arguments
- Automatically create an email ID based on the name
- Set a private static ID
- Generate a user ID that is combination of Static ID, random 4-digit number between 1000 and 9000, and last 4 of SSN
- Methods: enroll(), pay(), checkBalance(), toString(), showCourses()
- Use encapsulation to set variables (phone, city, state)
     */

    public static void main(String[] args) {

        Student student1 = new Student("C.Tevez", "11220976");
        student1.setEmail();
        student1.userID();
        student1.enroll("Course 1");
        student1.pay(500.0);
        student1.checkBalance();
        student1.toString();
        student1.showCourses();

    }
}
