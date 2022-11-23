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
        productManager.add(product);


        //Overloading
        Dortislem hesaplayici = new Dortislem();
        System.out.println(hesaplayici.topla(3,5));
        System.out.println(hesaplayici.topla(3,5,7));

        //Inheritence
        Customer customer = new Customer();
        Employee employee = new Employee();

        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();
        //Inheritence Demo
        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        ogretmenKrediManager.hesapla();

        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(ogretmenKrediManager);
        krediUI.KrediHesapla(new AskerKrediManager());
        //Polimorfizm
        BaseLogger[] loggers = new BaseLogger[]{new EmailLogger(),new FileLogger(),new DatabaseLogger(),new ConsoleLogger()};
        for (BaseLogger log:loggers){
            log.logger("Log Mesajı");
        }
        CustomerManager customerManager1 = new CustomerManager(new ConsoleLogger());
        customerManager1.add();
        System.out.println("                                                                 ");

        //Overriding
        BaseKrediManager[] krediManagers = new BaseKrediManager[]{new AskerKrediManager(),new OgretmenKrediManager(),new TarimKrediManager()};
        for (BaseKrediManager krediManager: krediManagers) {
            krediManager.hesapla(1000);

        }

        //Abstract
        WomenGameCalculator womenGameCalculator = new WomenGameCalculator();
        womenGameCalculator.hesapla();
        womenGameCalculator.gameOver();

        GameCalculator[] gameCalculator = new GameCalculator[]{new ManGameCalculator()};


    }
}