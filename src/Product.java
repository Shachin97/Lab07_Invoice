import java.util.Scanner;

public class Product
{
    String name;
    String itemPrice;

    Scanner in = new Scanner(System.in);

    public Product(String name, String itemPrice) {
        this.name = name;
        this.itemPrice = itemPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", itemPrice='" + itemPrice + '\'' +
                '}';
    }

}
