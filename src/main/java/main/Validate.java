// Class for validating the user input

package main;

import java.util.*;

public class Validate {

   public boolean validateSelectOptions(String input) {
	   int x = Integer.parseInt(input);
	   return x == 1 || x == 2 || x == 3 || x == 4 || x == 5;
   }

   public boolean validateSelectProduct(String input){
       String[] x = {"B", "C", "D", "F", "O"};
       return Arrays.asList(x).contains(input.toUpperCase());
   }
}
