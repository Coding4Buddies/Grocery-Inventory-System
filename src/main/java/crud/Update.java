// Class for Adding Data to File

package crud;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Update extends FileOperation{
    
     List<String[]> records = new ArrayList<>(); 
    
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
    }
}
