public class FileLogger extends BaseLogger{
    @Override
    public void logger(String message) {
        System.out.println("Dosyalara loglandı: "+message);
    }
}
