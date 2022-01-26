// Parent Class for the the CRUD Operation

package crud;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileOperation {
    
    private String directory = "data";
    private String filename = "data.csv";
    private List<String[]> records = new ArrayList<>();

    public FileOperation() {
        try {
           if(createDir()) {
               createFile();
           }
           populateList();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    
    // Method that creates Directory
    public boolean createDir() {
        File theDir = new File(directory + "/");
        if (!theDir.exists()){
            theDir.mkdirs();
        }
        return true;
    }
    
    // Method that creates the File
    public void createFile() throws IOException {
         File tempFile = new File(directory + "/" + filename);
            if(!tempFile.exists()) 
                tempFile.createNewFile();
    }
    
    // Method that returns the location and name of File
    public String getFileLocation(){
        return directory + "/" + filename;
    }
    
    // Method that populatest the records list from the file
    public void populateList() {
        try(BufferedReader br = new BufferedReader(new FileReader(getFileLocation()))) {
            String line = "";
            while ((line = br.readLine()) != null) {
                records.add(line.split(","));
            }
        } catch (FileNotFoundException e) {
          //Some error logging
        } catch (IOException ex) {
            Logger.getLogger(FileOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Getter for records List
    public List<String[]> getRecords() {
        return records;
    }

    // Setter for records List
    public void setRecords(List<String[]> records) {
        this.records = records;
    }
    
    // Insert data inside the records list
    public void insertRecords(String[] data){
        this.records.add(data);
    }
    
    // Method that modify the data inside the text file
    public void modifyData(){
        try {
            FileWriter writer = new FileWriter(getFileLocation());
            for(String[] a : getRecords()){
                String formatArray = Arrays.toString(a).replace("[", "").replace("]", "").trim();
                writer.write(formatArray + "\n");
            }
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(FileOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
