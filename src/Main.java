public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(15000);
        product.setStockAmount(3);
        product.setRenk("kırmızı");

        Product product1 = new Product(1,"myName","bilmem",1000,3,"A5555","kırmızı");


        ProductManager productManager = new ProductManager();
        productManager.Add(product);


        //Overloading
        Dortislem hesaplayici = new Dortislem();
        System.out.println(hesaplayici.topla(3,5));
        System.out.println(hesaplayici.topla(3,5,7));

        //Inheritence
        Customer customer = new Customer();
        Employee employee = new Employee();

        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();



    }
}