public class BaseKrediManager {
    public void hesapla(){
        System.out.println("Kredi hesapland─▒.");
    }
    public double hesapla(int a){ //Burada final ifadesi ile metod override edilemez hale getirilebilir.
        System.out.println("Kredi hesapland─▒: "+ a*1.18);
        return a*1.18;
    }
}
