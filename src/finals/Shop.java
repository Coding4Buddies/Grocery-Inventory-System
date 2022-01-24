/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finals;

import java.util.ArrayList;

public class Shop {
     private int item_no;
     private String item_name;
     private float item_price;
     private String item_product;
     
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
}
