package Assignment_1;

public class ShoppingCart {

	Product aprod[];
    int cindex;
    
    
    //constructor
    ShoppingCart(){
        aprod=new Product[5];        
    }
    
    //member methods
    //add Product
    Product addProduct(Product prod) {
        aprod[cindex]=prod;
        cindex++;    
        System.out.println("Added product with id "+prod.id);
        return prod;
    }
    
    //list products
    void listProducts() {
        for(int i=0;i<cindex;i++) {
            aprod[i].display();
        }    
    }
    
    //Empty cart
    void emptyCart(){
        aprod = new Product[5];//Reinitialize the product array
        cindex=0;
        System.out.println("Deleted all items from cart");
        System.out.println("Cart is empty");
    }
    
    //Checkout
    void checkout() {
        double totalAmount=0.0;
        System.out.println("Checkout - Product List");
        for(int i=0;i<cindex;i++) {
            aprod[i].display();
            totalAmount+=aprod[i].price;
        }
        System.out.println("Total Amount: "+totalAmount);
        emptyCart(); //Empty the cart after checkout
    }
    
    public static void main(String[] args) {    
        ShoppingCart scart= new ShoppingCart();
        
        Product p1=new Product(100, "Mobile", 15000.0);
        scart.addProduct(p1);
        Product p2=new Product(200, "Clothing",799.9);
        scart.addProduct(p2);
        scart.listProducts();
        scart.checkout();
        scart.listProducts(); //verify list is empty        
    }
}

class Product {
    int id;
    String name;
    double price;
    
    //constructor
    Product(){
        id=0;
        name="";
        price=0.0;
    }
    //constructor with parameters
    Product(int pid,String pname,double pprice){
        id=pid;
        name=pname;
        price=pprice;
    }

    void display() {
        System.out.println("id="+id+" name="+name+" Price="+price);
    }
    
}
