public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.name = "laptop";
        product.id = 1;
        product.description = "Asus Laptop";
        product.price = 15000;
        product.stockAmount = 3;

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
    }
}