package finals;
import java.util.Scanner;
import java.util.ArrayList;
public class Finals {
    
    static void menu(){
        System.out.println(" A - Add New Item");
        System.out.println(" D - Display Inventory");
        System.out.println(" U - Update Inventory");
        System.out.println(" X - Delete Items");
        System.out.println(" E - Exit");
    }
    public static void main(String[] args) {
      String opt;
      Scanner sc = new Scanner(System.in);
      ArrayList<Shop> List = new ArrayList<Shop>();
      
      for (int x = 0; x < 5; x++){
      do{
          menu();
          Shop s = new Shop();
          opt = sc.nextLine();
          
          switch(opt){
              
              case "A":
                System.out.println("Choose one: Dry Goods, Frozen Goods, Supplies");
                s.setProduct(sc.nextLine());
                System.out.println("Enter Item Name: ");
                s.setName(sc.nextLine());
                System.out.println("Enter Item No. : ");
                s.setNo(sc.nextInt());
                System.out.println("Enter Item Price: ");
                s.setPrice(sc.nextFloat());
                s.AddnewItems(s);
                List.add(s);
                s.displayItems(List);
                break;
              case "D":
                  break;
              case "U":
                  break;
              case "X":
                  break;
              case "E":
                  System.exit(0);
                  break;
                  
              default:
                  break;
                   
                 }
              }
      
          while(opt.equals(0));
          
         }
    }
}
    

