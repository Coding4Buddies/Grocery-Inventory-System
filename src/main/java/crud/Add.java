// Class for Adding Data to File

package crud;

import java.io.*;

public class Add extends FileOperation{
    
    public Add() {
        super();
    }
    
    // Method that Add Data to the File
    public void writeToFile(String data, String filename){
        try{
            FileWriter data_writer = new FileWriter(filename, true);
            data_writer.write(data + "\n");
            data_writer.close();
            populateList();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
