// Class for Adding Data to File

package crud;

import java.util.ArrayList;
import java.util.List;

public class Delete extends FileParent{

    
    /* List<String[]> records = new ArrayList<>();
    
    public Delete() {
        super();        
    }
   
    // Method that Delete a Line based on the ID  
    public void deleteLine(String id){
        for(String[] a: getRecords()){
            if(!a[0].contains(id))
                records.add(a);
        }
        setRecords(records);
        modifyData();
    }*/

    List<String[]> records = new ArrayList<>();

    public Delete() {}

    public void setFileLocation(String filelocation) {
        setFilename(filelocation);
        populateList();
    }

    public void deleteLine(String id){
        for(String[] a: getRecords()){
            if(!a[0].contains(id)){
                records.add(a);
            }
        }
        setRecords(records);
        modifyData();
    }
}
