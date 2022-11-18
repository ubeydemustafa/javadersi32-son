public class ConsoleLogger extends BaseLogger{
    @Override
    public void logger(String message) {
        System.out.println("Console Loglandı: "+message);
    }
}
