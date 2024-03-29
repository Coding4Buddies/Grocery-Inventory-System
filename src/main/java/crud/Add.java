// Class for Adding Data to File

package crud;

import java.io.*;

public class Add extends FileParent{
    
    public Add() {
        super();
    }

    public void setFileLocation(String filelocation) {
        setFilename(filelocation);
    }
    // Method that Add Data to the File
    public void writeToFile(String data){
        try{
            FileWriter data_writer = new FileWriter(getFilename(), true);
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
