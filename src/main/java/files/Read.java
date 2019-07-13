package files;

import java.io.*;

public class Read {

    /*
    1. Define the file (path) that we want to read
    2. Create the file in Java
    3. Open the file
    4. Read the file
     */
    public static void main(String[] args) {

        String fileName = "C:\\Users\\Bartek\\IdeaProjects\\JavaTraining\\src\\main\\resources\\Files\\FileToRead.txt";

        File file = new File(fileName);
        BufferedReader bufferedReader = null;
        String text = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            text = bufferedReader.readLine();
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR! File not found: " + fileName);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("ERROR! Could not read the data: " + fileName);
            e.printStackTrace();
        } finally {
            System.out.println("Finished reading the file");
        }
        System.out.println(text);

    }
}
