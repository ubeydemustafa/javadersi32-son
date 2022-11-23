public class AskerKrediManager extends BaseKrediManager{
    @Override
    public double hesapla(int a) {
        System.out.println("Kredi hesaplandı: "+ a*1.17);
        return a*1.17;
    }
}
