public class ConsoleLogger extends BaseLogger{
    @Override
    public void Logger(String message) {
        System.out.println("Console Loglandı: "+message);
    }
}
