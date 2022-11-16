public class FileLogger extends BaseLogger{
    @Override
    public void Logger(String message) {
        System.out.println("Dosyalara loglandı: "+message);
    }
}
