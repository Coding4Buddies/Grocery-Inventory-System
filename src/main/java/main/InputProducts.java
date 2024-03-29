package main;

import crud.Add;
import products.*;

public class InputProducts {
    Add add = new Add();

    /*
     * For Beverages
     */
    public Beverages inputBeverages(int id, String name, int quantity, int price, double volume, String container) {
        Beverages p = new Beverages();
        p.setId(id); p.setName(name); p.setQuantity(quantity);
        p.setPrice(price); p.setVolume(volume); p.setContainer_type(container);
        return p;
    }

    public void insertBeverages(Beverages beverages) {
        add.setFileLocation("data/beverages.csv");
        String output = beverages.getId() +","
                + beverages.getName() + ","
                + beverages.getQuantity() + ","
                + beverages.getPrice() + ","
                + beverages.getVolume() + ","
                + beverages.getContainer_type();
        add.writeToFile(output);
    }

    /*
     * For Can Foods
     */
    public Can inputCan(int id, String name, int quantity, int price, String expiration) {
        Can p = new Can();
        p.setId(id); p.setName(name); p.setQuantity(quantity);
        p.setPrice(price); p.setExpiration_date(expiration);
        return p;
    }

    public void insertCan(Can can) {
        add.setFileLocation("data/can.csv");
        String output = can.getId() +","
                + can.getName() + ","
                + can.getQuantity() + ","
                + can.getPrice() + ","
                + can.getExpiration_date();
        add.writeToFile(output);
    }

    /*
     * For Dry Foods
     */
    public Dry inputDry(int id, String name, int quantity, int price) {
        Dry p = new Dry();
        p.setId(id); p.setName(name); p.setQuantity(quantity);
        p.setPrice(price);
        return p;
    }

    public void insertDry(Dry dry) {
        add.setFileLocation("data/dry.csv");
        String output = dry.getId() +","
                + dry.getName() + ","
                + dry.getQuantity() + ","
                + dry.getPrice();
        add.writeToFile(output);
    }

    /*
     * For Frozen Foods
     */
    public Frozen inputFrozen(int id, String name, int quantity, int price, double min, double max) {
        Frozen p = new Frozen();
        p.setId(id); p.setName(name); p.setQuantity(quantity);
        p.setPrice(price); p.setMaximum_temperature(max); p.setMinimum_temperature(min);
        return p;
    }

    public void insertFrozen(Frozen frozen) {
        add.setFileLocation("data/frozen.csv");
        String output = frozen.getId() +","
                + frozen.getName() + ","
                + frozen.getQuantity() + ","
                + frozen.getPrice() + ","
                + frozen.getMinimum_temperature() + ","
                + frozen.getMaximum_temperature();
        add.writeToFile(output);
    }

    /*
     * For Others
     */
    public Others inputOthers(int id, String name, int quantity, int price) {
        Others p = new Others();
        p.setId(id); p.setName(name); p.setQuantity(quantity);
        p.setPrice(price);
        return p;
    }

    public void insertOthers(Others others) {
        add.setFileLocation("data/others.csv");
        String output = others.getId() +","
                + others.getName() + ","
                + others.getQuantity() + ","
                + others.getPrice();
        add.writeToFile(output);
    }
}
