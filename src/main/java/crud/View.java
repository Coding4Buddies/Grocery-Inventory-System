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
    }

    //Method to View Data the file
    public void viewFile() {
        try {
            File myObj = new File(getFilename());
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
