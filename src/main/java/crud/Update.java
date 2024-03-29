// Class for Adding Data to File

package crud;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Update extends FileParent{
    
     /*List<String[]> records = new ArrayList<>();
    
    public Update(){
        super();
    }
    
    // Method that Update a Line based on the ID  
    public void UpdateData(String id){
        for(String[] a: getRecords()){
            if(a[0].contains(id))
               records.add(new String[]{id, "test", "test"});
            else
                records.add(a);
        }
        setRecords(records);
        modifyData();
    }*/

    List<String[]> records = new ArrayList<>();

    public void setFileLocation(String filelocation) {
        setFilename(filelocation);
        populateList();
    }

    public void updateData(String id, int row, String change){
        for(String[] a: getRecords()){
            if(a[0].contains(id)){
                a[row] = change;
                records.add(a);
            } else {
                records.add(a);
            }
        }
        setRecords(records);
        modifyData();
    }
}
