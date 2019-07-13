package filesToReadAndWrite;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

    /*
    1. Define the file path that we want to write
    2. Create the file in Java
    3. Open the file
    4. Write to the file
    5. Close the resources
     */
    public static void main(String[] args) {

        String fileName = "C:\\Users\\Bartek\\IdeaProjects\\JavaTraining\\src\\main\\resources\\Files\\FileToWrite";
        String message = "I'm writing data that will be placed to a file";

        File file = new File(fileName);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(message);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("ERROR! Could not read file: " + fileName);
            e.printStackTrace();
        } finally {
            System.out.println("Closing the filewriter");
        }
    }
}
