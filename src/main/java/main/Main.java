// Main Class of the Program

package main;

import crud.*;
import products.*;

import java.util.*;

public class Main {
    
	Scanner scan = new Scanner(System.in);
	Validate validate = new Validate();
    InputProducts inputProducts = new InputProducts();

    View view = new View();
    Delete delete = new Delete();
    Update update = new Update();

    Product beverages = new Beverages();
    Product frozen = new Frozen();
    Product dry = new Dry();
    Product can = new Can();
    Product other = new Others();
    
    public void options(){
        System.out.println("Choose Options to Pick: ");
        System.out.println("1 - Add Products");
        System.out.println("2 - View Products");
        System.out.println("3 - Update Products");
        System.out.println("4 - Delete Products");
        System.out.println("5 - Exit Program");
    }
    
    public int pickOptions(){
    	while(true){
    		try {
    			 System.out.println("------------------------------");
        	     System.out.print("Choose CRUD Operation: ");
        	     String opt = scan.nextLine();
        	     if(validate.validateSelectOptions(opt)) {
                     return Integer.parseInt(opt);
                 } else {
                     System.out.println("Pick Only 1 to 4");
                 }
    		} catch(Exception ex) {
                System.out.println("------------------------------");
    			System.out.println("Pick a Number");
    		}
    	}
    }

    public void optionProducts() {
        System.out.println("\nChoose Products to Select: ");
        System.out.print(" B - "); beverages.category_name();
        System.out.print(" C - "); can.category_name();
        System.out.print(" D - "); dry.category_name();
        System.out.print(" F - "); frozen.category_name();
        System.out.print(" O - "); other.category_name();
    }

    public String selectProducts() {
        while(true){
            try {
                System.out.println("------------------------------");
                System.out.print("Choose Product: ");
                String opt = scan.nextLine();
                if(validate.validateSelectProduct(opt)) {
                    return opt.toUpperCase();
                } else {
                    System.out.println("Pick B, D, C, F and O Only");
                }
            } catch(Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public void addSelectedProducts(String input) {
        System.out.println();
        if(input.equals("B")) {
            System.out.println("Input for Beverages:");
            System.out.print("ID: ");
            String id = scan.nextLine();
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Quantity: ");
            String quantity = scan.nextLine();
            System.out.print("Price (₱): ");
            String price = scan.nextLine();
            System.out.print("Volume (ml): ");
            String volume = scan.nextLine();
            System.out.print("Container Type: ");
            String container = scan.nextLine();

            try {
                inputProducts.insertBeverages(inputProducts.inputBeverages(Integer.parseInt(id), name, Integer.parseInt(quantity),
                        Integer.parseInt(price), Double.parseDouble(volume), container));
            } catch (Exception ex) {
                System.out.println("Error!!! Try Again");
            }


        } else if (input.equals("C")) {
            System.out.println("Input for Can/Jar Foods: ");
            System.out.print("ID: ");
            String id = scan.nextLine();
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Quantity: ");
            String quantity = scan.nextLine();
            System.out.print("Price (₱): ");
            String price = scan.nextLine();
            System.out.print("Expiration Date: ");
            String expiration = scan.nextLine();

            try {
                inputProducts.insertCan(inputProducts.inputCan(Integer.parseInt(id), name, Integer.parseInt(quantity),
                        Integer.parseInt(price), expiration));
            } catch (Exception ex) {
                System.out.println("Error!!! Try Again");
            }

        } else if (input.equals("D")) {
            System.out.println("Input for Dry Foods: ");
            System.out.print("ID: ");
            String id = scan.nextLine();
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Quantity: ");
            String quantity = scan.nextLine();
            System.out.print("Price (₱): ");
            String price = scan.nextLine();

            try {
                inputProducts.insertDry(inputProducts.inputDry(Integer.parseInt(id), name, Integer.parseInt(quantity),
                        Integer.parseInt(price)));
            } catch (Exception ex) {
                System.out.println("Error!!! Try Again");
            }

        } else if (input.equals("F")) {
            System.out.println("Input for Frozen Foods: ");
            System.out.print("ID: ");
            String id = scan.nextLine();
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Quantity: ");
            String quantity = scan.nextLine();
            System.out.print("Price (₱): ");
            String price = scan.nextLine();
            System.out.println("Minimum Temperature: ");
            String minimum = scan.nextLine();
            System.out.println("Maximum Temperature: ");
            String maximum = scan.nextLine();

            try {
                inputProducts.insertFrozen(inputProducts.inputFrozen(Integer.parseInt(id), name, Integer.parseInt(quantity),
                        Integer.parseInt(price), Double.parseDouble(minimum), Double.parseDouble(maximum)));
            } catch (Exception ex) {
                System.out.println("Error!!! Try Again");
            }

        } else if (input.equals("O")) {
            System.out.println("Input for Others: ");
            System.out.print("ID: ");
            String id = scan.nextLine();
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Quantity: ");
            String quantity = scan.nextLine();
            System.out.print("Price (₱): ");
            String price = scan.nextLine();

            try {
                inputProducts.insertOthers(inputProducts.inputOthers(Integer.parseInt(id), name, Integer.parseInt(quantity),
                        Integer.parseInt(price)));
            } catch (Exception ex) {
                System.out.println("Error!!! Try Again");
            }
        }
    }

    public void viewSelectedProducts(String input) {
        System.out.println();
        if(input.equals("B")) {
            view.setFileLocation("data/beverages.csv");
            System.out.println("Output for Beverages:\n");
            System.out.println("ID, NAME, QUANTITY, PRICE, VOLUME, CONTAINER TYPE");
            System.out.println("===================================================");
            view.viewFile();
        } else if(input.equals("C")) {
            view.setFileLocation("data/can.csv");
            System.out.println("Output for Cans Foods: \n");
            System.out.println("ID, NAME, QUANTITY, PRICE, EXPIRATION DATE");
            System.out.println("===================================================");
            view.viewFile();
        } else if(input.equals("D")) {
            view.setFileLocation("data/dry.csv");
            System.out.println("Output for Dry Foods: \n");
            System.out.println("ID, NAME, QUANTITY, PRICE");
            System.out.println("==================================");
            view.viewFile();
        } else if(input.equals("F")) {
            view.setFileLocation("data/frozen.csv");
            System.out.println("Output for Frozen Foods: \n");
            System.out.println("ID, NAME, QUANTITY, PRICE, MINIMUM TEMP, MAXIMUM TEMP");
            System.out.println("========================================================");
            view.viewFile();
        } else if(input.equals("O")) {
            view.setFileLocation("data/others.csv");
            System.out.println("Output for Others: \n");
            System.out.println("ID, NAME, QUANTITY, PRICE");
            System.out.println("==================================");
            view.viewFile();
        }
    }

    public void deleteSelectedProducts(String input) {
        System.out.println();
        if(input.equals("B")) {
            delete.setFileLocation("data/beverages.csv");

            try {
                System.out.print("Type ID to Delete: ");
                String id = scan.nextLine();
                delete.deleteLine(id);
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        } else if (input.equals("C")) {
            delete.setFileLocation("data/can.csv");

            try {
                System.out.print("Type ID to Delete: ");
                String id = scan.nextLine();
                delete.deleteLine(id);
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        } else if (input.equals("D")) {
            delete.setFileLocation("data/dry.csv");

            try {
                System.out.print("Type ID to Delete: ");
                String id = scan.nextLine();
                delete.deleteLine(id);
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        } else if (input.equals("F")) {
            delete.setFileLocation("data/frozen.csv");

            try {
                System.out.print("Type ID to Delete: ");
                String id = scan.nextLine();
                delete.deleteLine(id);
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        } else if (input.equals("O")) {
            delete.setFileLocation("data/others.csv");

            try {
                System.out.print("Type ID to Delete: ");
                String id = scan.nextLine();
                delete.deleteLine(id);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public void updateSelectedProducts(String input) {
        System.out.println();
        if(input.equals("B")) {
            update.setFileLocation("data/beverages.csv");

            try {
                System.out.print("Type ID to Update: ");
                String id = scan.nextLine();
                System.out.print("Type Row to Select: ");
                String row = scan.nextLine();
                System.out.print("Value to Change: ");
                String value = scan.nextLine();

                update.updateData(id, Integer.parseInt(row), value);
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        } else if(input.equals("C")) {
            update.setFileLocation("data/can.csv");

            try {
                System.out.print("Type ID to Update: ");
                String id = scan.nextLine();
                System.out.print("Type Row to Select: ");
                String row = scan.nextLine();
                System.out.print("Value to Change: ");
                String value = scan.nextLine();

                update.updateData(id, Integer.parseInt(row), value);
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        } else if(input.equals("D")) {
            update.setFileLocation("data/dry.csv");

            try {
                System.out.print("Type ID to Update: ");
                String id = scan.nextLine();
                System.out.print("Type Row to Select: ");
                String row = scan.nextLine();
                System.out.print("Value to Change: ");
                String value = scan.nextLine();

                update.updateData(id, Integer.parseInt(row), value);
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        } else if(input.equals("F")) {
            update.setFileLocation("data/frozen.csv");

            try {
                System.out.print("Type ID to Update: ");
                String id = scan.nextLine();
                System.out.print("Type Row to Select: ");
                String row = scan.nextLine();
                System.out.print("Value to Change: ");
                String value = scan.nextLine();

                update.updateData(id, Integer.parseInt(row), value);
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        } else if(input.equals("O")) {
            update.setFileLocation("data/others.csv");

            try {
                System.out.print("Type ID to Update: ");
                String id = scan.nextLine();
                System.out.print("Type Row to Select: ");
                String row = scan.nextLine();
                System.out.print("Value to Change: ");
                String value = scan.nextLine();

                update.updateData(id, Integer.parseInt(row), value);
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
    }

    public void printOutput(int op) {
        if(op == 1) {
            optionProducts();
            String choose = selectProducts();
            viewSelectedProducts(choose);
            addSelectedProducts(choose);
        } else if (op == 2){
            optionProducts();
            viewSelectedProducts(selectProducts());
        } else if (op == 3) {
            optionProducts();
            String choose = selectProducts();
            viewSelectedProducts(choose);
            updateSelectedProducts(choose);
        } else if (op == 4) {
            optionProducts();
            String choose = selectProducts();
            viewSelectedProducts(choose);
            deleteSelectedProducts(choose);
        }
    }

    public static void main(String args[]) {
       Main main = new Main();

       while(true) {
           System.out.println();
           main.options();
           System.out.println();
           int choice = main.pickOptions();
           if(choice == 5) {
               System.out.println("Thanks for using us!!");
               break;
           } else{
               main.printOutput(choice);
           }
       }
    }
}
