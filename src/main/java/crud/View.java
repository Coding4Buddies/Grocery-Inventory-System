// Class for View Data to File

package crud;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class View extends FileOperation{
    
    public View() {
        super();
    }
    
    //Method to View Data the file
    public void viewFile() {
        for(String [] data : getRecords()){
            System.out.println(Arrays.toString(data));
        }
    }
}
