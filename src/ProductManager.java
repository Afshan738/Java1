public class ProductManager {
    private Product myProduct;

    public ProductManager() {// CONSTRUCTORRR...
        this.myProduct = null;

    }

    public void addProduct(Product productToAdd) {
        if (this.myProduct == null) {
            this.myProduct = productToAdd;
            System.out.println("the " + productToAdd.getProductName() + " has been added. THANK YOU");
        } else {
            System.out.println("u are not allowed to add more than one product...product is already present");
        }
    }

    // also we can say that we can use this to refer to the current product like
    // current object
    public void viewProduct() {
        if (this.myProduct != null) {
            System.out.println("Id: " + this.myProduct.getProductId());
            System.out.println("Name: " + this.myProduct.getProductName());
            System.out.println("Price:" + this.myProduct.getProductPrice());
        } else {
            System.out.println("No product found .....");
        }
    }

    public void removeProduct() {
        if (this.myProduct != null) {
            System.out.println("the " + this.myProduct.getProductName() + " has been removed...");
            this.myProduct = null;
        } else {
            System.out.println("their is no product to remove");
        }
    }

    public Product searchProductById(int productIdToFind) {
        if (this.myProduct != null && this.myProduct.getProductId() == productIdToFind) {
            return this.myProduct;
        }
        return null;
    }
}
