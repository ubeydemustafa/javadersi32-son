public class OgretmenKrediManager extends BaseKrediManager{
    @Override
    public double hesapla(int a) {
        System.out.println("Kredi hesapland─▒: "+ a*1.19);
        return a*1.19;
    }
}
