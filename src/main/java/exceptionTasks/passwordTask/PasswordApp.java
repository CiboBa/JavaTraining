package exceptionTasks.passwordTask;

import java.io.*;

public class PasswordApp {

    public static void main(String[] args) {

        String fileName = "C:\\Users\\Bartek\\IdeaProjects\\JavaTraining\\src\\main\\resources\\Files\\Passwords";
        File file = new File(fileName);
        String password = null;
        String[] passwords = new String[13];

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            for (int i = 0; i < passwords.length; i++) {
                passwords[i] = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR! File not found: " + fileName);
        } catch (IOException e) {
            System.out.println("ERROR! Could not read the file: " + fileName);
        }

        for (String s : passwords) {
            password = s;
            System.out.println("\n" + password);
            try {
                assert password != null;
                if (!password.matches(".*\\p{Digit}.*")) {
                    throw new DigitException(password);
                }
                if (!password.matches(".*\\p{Alpha}.*")) {
                    throw new LetterException(password);
                }
                if (!password.matches(".*\\p{Punct}.*")) {
                    throw new SpecialCharException(password);
                }
                else System.out.println("Password valid!");
            } catch (DigitException e) {
                System.out.println("ERROR! Password must contain at least one digit");
                System.out.println(e.toString());
            } catch (LetterException e) {
                System.out.println("ERROR! Password must contain at least one letter");
                System.out.println(e.toString());
            } catch (SpecialCharException e) {
                System.out.println("ERROR! Password must contain at least one special character");
                System.out.println(e.toString());
            }
        }
    }
}