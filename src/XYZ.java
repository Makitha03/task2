import java.util.Scanner;
class Product
{
    private String pid;
    private double price;
    private int quantity;

    public Product(String pid, double price, int quantity)
    {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    public String getPid()
    {
        return pid;
    }

    public double getPrice()
    {
        return price;
    }

    public int getQuantity()
    {
        return quantity;
    }

    @Override
    public String toString()
    {
        return "Product{" +
                "pid='" + pid + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}


public class XYZ
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5];


        for (int i = 0; i < 5; i++)
        {
            System.out.println("Enter Product ID for product " + (i + 1)+":");
            String pid = scanner.nextLine();
            System.out.println("Enter Price for product " + (i + 1) + ": ");
            double price = scanner.nextDouble();
            System.out.println("Enter Quantity for product " + (i + 1) + ": ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over
            products[i] = new Product(pid, price, quantity);
        }


        Product highestPriceProduct = products[0];
        for (Product product : products)
        {
            if (product.getPrice() > highestPriceProduct.getPrice())
            {
                highestPriceProduct = product;
            }
        }
        System.out.println("The Product ID with the highest price is: " + highestPriceProduct.getPid());


        double totalAmountSpent = calculateTotalAmount(products);
        System.out.println("The total amount spent on all products is: " + totalAmountSpent);
    }

    public static double calculateTotalAmount(Product[] products)
    {
        double totalAmount = 0;
        for (Product product : products)
        {
            totalAmount += product.getPrice() * product.getQuantity();
        }
        return totalAmount;
    }
}

