public class CustomerManager extends PersonManager{
    private BaseLogger baseLogger;

    public CustomerManager() {
    }

    public CustomerManager(BaseLogger logger) {
        this.baseLogger = logger;
    }

    @Override
    public void add() {
        System.out.println("Müşteri eklendi.");
        this.baseLogger.logger("kayıt oluşturuldu.");
    }
}
