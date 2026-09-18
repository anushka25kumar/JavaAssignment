interface Product {
void calculatePrice();
}
class ProductDetails {
String name;
double price;
ProductDetails(String name, double price) {
this.name = name;
this.price = price;
}
void displayProduct() {
System.out.println("Product Name: " + name);
System.out.println("Base Price: " + price);
}
}
class Electronic extends ProductDetails implements Product {
int warranty;
Electronic(String name, double price, int warranty) {
super(name, price);
this.warranty = warranty;
}
public void calculatePrice() {
double finalPrice = price + (price * 0.18);
System.out.println("Warranty: " + warranty + " years");
System.out.println("Price after GST: " + finalPrice);
}
}
class Clothing extends ProductDetails implements Product {
String size;
Clothing(String name, double price, String size) {
super(name, price);
this.size = size;
}
public void calculatePrice() {
double finalPrice = price + (price * 0.05);
System.out.println("Size: " + size);
System.out.println("Price after GST: " + finalPrice);
}
}
class Grocery extends ProductDetails implements Product {
String expiryDate;
Grocery(String name, double price, String expiryDate) {
super(name, price);
this.expiryDate = expiryDate;
}
public void calculatePrice() {
double finalPrice = price + (price * 0.05);
System.out.println("Expiry Date: " + expiryDate);
System.out.println("Price after GST: " + finalPrice);
}
}
public class Main {
public static void main(String[] args) {
Electronic e = new Electronic("Laptop", 50000, 2);
Clothing c = new Clothing("T-Shirt", 1000, "M");
Grocery g = new Grocery("Rice", 800, "20-12-2026");
System.out.println("Electronic Product");
e.displayProduct();
e.calculatePrice();
System.out.println();
System.out.println("Clothing Product");
c.displayProduct();
c.calculatePrice();
System.out.println();
System.out.println("Grocery Product");
g.displayProduct();
g.calculatePrice();
}
}
/* Electronic Product
  Product Name: Laptop
  Base Price: 50000.0
  Warranty: 2 years 
  Price after GST: 59000.0

  Clothing Product 
  Product Name: T-Shirt
  Base Price: 1000.0
  Size: M
  Price after GST: 1050.0

  Grocery Product 
  Product Name: Rice 
  Base Price: 800.0
  Expiry Date: 20-12-2026
  Price after GST: 840.0 */
