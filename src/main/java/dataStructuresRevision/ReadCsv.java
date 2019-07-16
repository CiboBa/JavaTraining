package dataStructuresRevision;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCsv {

    //This method will read data from a CSV file

    public static void main(String[] args) {

        List<String[]> data = new ArrayList<String[]>();
        String fileName = "C:\\Users\\Bartek\\IdeaProjects\\JavaTraining\\src\\main\\resources\\Files\\Account.csv";
        String dataRow;

        try {
            //Open the file
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            //Read the data as it's not empty
            while ((dataRow = bufferedReader.readLine()) != null) {
                //Parse the data by commas
                String[] line = dataRow.split(",");
                //Add the data to collection
                data.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String[] account : data) {
            System.out.print("[ ");
            for (String field : account) {
                System.out.print(field + " ");
            }
            System.out.print("]\n");
        }
    }
}
