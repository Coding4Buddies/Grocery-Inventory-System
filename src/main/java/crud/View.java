// Class for View Data to File

package crud;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class View extends FileParent{
    
    public View() {
        super();
    }

    public void setFileLocation(String filelocation) {
        setFilename(filelocation);
        populateList();
    }

    //Method to View Data the file
    public void viewFile() {
        for(String[] a: getRecords()){
            String formatArray = Arrays.toString(a).replace("[", "").replace("]", "").trim();
            System.out.println(formatArray);
        }
    }
}
