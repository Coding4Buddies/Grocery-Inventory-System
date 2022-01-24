package finals;

import java.util.ArrayList;
import java.util.List;

public class Shop {
     private int item_no;
     private String item_name;
     private float item_price;
     private String item_product;
     private int itemnum;
     
     // getter setter
     public void setName(String Name){
         this.item_name = Name;   
     }
     
     public String getName(){
         return this.item_name;
          
     }
     public void setNo (int no){
         this.item_no = no;   
     }
     
     public int getNo(){
         return this.item_no;
          
     }
     
     public int setDel(int no){
         return this.item_no = no;
     }
     
     
     public void setPrice(float price){
         this.item_price = price;   
     }
     
     public float getprice(){
         return this.item_price;
          
     }
     public void setProduct(String prod){
         this.item_product = prod;   
     }
     
     public String getProduct(){
         return this.item_product;
          
     }
     
     //functions
     public void AddnewItems(Shop s){
         this.item_name= s.item_name;
         this.item_no = s.item_no;
         this.item_price = s.item_price;
         this.item_product = s.item_product;
     }
     
     public void displayItems(ArrayList<Shop> arr){
         for (Shop shop : arr){
             System.out.println("------------------------------------------------------------------------------------------");
             System.out.println("Item Name\t\tItem No.\t\tItem Price\t\tItem Product");
             System.out.println(shop.item_name + " \t\t "+ shop.item_no +" \t\t "+ shop.item_price + " \t\t " + shop.item_product);
             System.out.println("------------------------------------------------------------------------------------------");
         }
     }
     
     //Delete
     public void setItemsIndex(ArrayList<Shop> arr, int itemnumber) {
         for (Shop shop : new ArrayList<Shop>(arr)){
             if(shop.item_no == itemnumber){
                 arr.remove(shop); // REMOVE ONLY IF ITEM NUMBER MATCH USER INPUT
             }
         }
     }
     
      public int getItemsIndex() {
          return itemnum;
     }
     
}