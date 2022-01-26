package crud;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileParent {
    private List<String[]> records = new ArrayList<>();
    String filename;

    public List<String[]> getRecords() {
        return records;
    }

    public void setRecords(List<String[]> records) {
        this.records = records;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public void populateList() {
        try(BufferedReader br = new BufferedReader(new FileReader(getFilename()))) {
            String line;
            while ((line = br.readLine()) != null) {
                records.add(line.split(","));
            }
        } catch (FileNotFoundException e) {
            //Some error logging
        } catch (IOException ex) {
            Logger.getLogger(FileOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modifyData(){
        try {
            FileWriter writer = new FileWriter(getFilename());
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
