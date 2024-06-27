//Create a class representing a ShoppingCart with methods to add items, remove items, and calculate total cost.
class ShoppingCart{
    int totalcost=0;
    String remove_item,item;
    void add(String item,int price){
        System.out.println("item added. :"+item);
        totalcost=totalcost+price;
    }
    void remove(String remove_item){
        this.remove_item=remove_item;
        System.out.println("Item removed. :"+remove_item);
    }
    void caclulateCost(){
        System.out.println("Total price in the cart is :"+totalcost);
    }

}
public class ShoppingCartClass {
    public static void main(String[] args) {
        ShoppingCart s1=new ShoppingCart();
        s1.add("PS5",55000);
        s1.add("xbox",50000);
        s1.remove("xbox");
        s1.caclulateCost();    
    }
}
