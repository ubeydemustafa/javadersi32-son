public class BaseKrediManager {
    public void hesapla(){
        System.out.println("Kredi hesaplandı.");
    }
    public double hesapla(int a){ //Burada final ifadesi ile metod override edilemez hale getirilebilir.
        System.out.println("Kredi hesaplandı: "+ a*1.18);
        return a*1.18;
    }
}
