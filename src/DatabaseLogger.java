public class DatabaseLogger extends BaseLogger{
    @Override
    public void logger(String message) {
        System.out.println("Database'e loglandı: "+ message);
    }
}
