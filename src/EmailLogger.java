public class EmailLogger extends BaseLogger{
    @Override
    public void Logger(String message) {
        System.out.println("Mail olarak loglandı: "+message);
    }
}
