package exceptionTasks.phoneNumberTask;

import java.io.*;

public class PhoneNumberApp {

    /*
    This will read a text file and will retrieve phone number
    Valid phone number:
    - 9 digits long
    - area code cannot start with 0 and 1
    - there cannot be 112 sequence in the phone
     */

    public static void main(String[] args) {
        String fileName = "C:\\Users\\Bartek\\IdeaProjects\\JavaTraining\\src\\main\\resources\\Files\\PhoneNumbers.txt";
        File file = new File(fileName);
        String[] phoneNumbers = new String[6];
        String phoneNumber = null;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            for (int i = 0; i < phoneNumbers.length; i++) {
                phoneNumbers[i] = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR! File not found");
        } catch (IOException e) {
            System.out.println("ERROR! Could not read");
        }

        for (String number : phoneNumbers) {
            phoneNumber = number;
            try {
                if (phoneNumber.length() != 9) {
                    throw new NineDigitsException(phoneNumber);
                }
                if (phoneNumber.substring(0, 1).equals("0") || phoneNumber.substring(0, 1).equals("1")) {
                    throw new AreaCodeException(phoneNumber);
                }
                for (int j = 0; j < phoneNumber.length() - 2; j++) {
                    if (phoneNumber.substring(j, (j + 2)).equals("11")) {
                        if (phoneNumber.substring((j + 2), (j + 3)).equals("2")) {
                            throw new EmergencyNumberException(phoneNumber);
                        }
                    }
                }
                System.out.println(phoneNumber);
            } catch (
                    NineDigitsException e) {
                System.out.println("ERROR! Number is not 9 digits");
                System.out.println(e.toString());
            } catch (
                    AreaCodeException e) {
                System.out.println("ERROR! Phone number has invalid area code");
                System.out.println(e.toString());
            } catch (
                    EmergencyNumberException e) {
                System.out.println("ERROR! Invalid 112 sequence found");
                System.out.println(e.toString());
            }
        }
    }
}
