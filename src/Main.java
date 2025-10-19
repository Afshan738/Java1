
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Scanner afshanQScanner = new Scanner(System.in);

        while (true) { // here the i have used the while loop...it will again and again ask about the
                       // choice until user wants to exit
            System.out.println("Enter 5 if u want to exit");
            System.out.println("Enter 0 if u want to add a product");
            System.out.println("Enter 1 if u want to view the product");
            System.out.println("Enter 2 if u want to search the product ...");
            System.out.println("Enter 3 if u want to remove the product  ");
            int choice = afshanQScanner.nextInt();
            afshanQScanner.nextLine();
            if (choice == 1) {
                System.out.println("displaying the product we added");
                manager.viewProduct();

            } else if (choice == 5) {
                break;
            } else if (choice == 2) {
                System.out.println("Searching for the prodcut");
                System.out.println("Enter the Id of the product to search");
                int pid = afshanQScanner.nextInt();
                afshanQScanner.nextLine();
                Product foundProduct = manager.searchProductById(pid);
                if (foundProduct != null) {
                    System.out.println("the product is: " + foundProduct.getProductName());
                } else {
                    System.out.println("Sorry ...product not found");
                }

            } else if (choice == 0) {
                System.out.println("Add a singleproduct info plzz...");
                System.out.println("Add product name plzz..");
                String product_name = afshanQScanner.nextLine();
                System.out.println("Add product price plzz..");
                double product_price = afshanQScanner.nextDouble();
                afshanQScanner.nextLine();
                System.out.println("Add ID name plzz..");
                int product_id = afshanQScanner.nextInt();
                afshanQScanner.nextLine();
                Product laptop = new Product(product_id, product_name, product_price);
                manager.addProduct(laptop);

            } else if (choice == 3) {

                manager.removeProduct();
            } else {
                System.out.println("Invalid input🙄");
            }
        }
        afshanQScanner.close();

    }
}