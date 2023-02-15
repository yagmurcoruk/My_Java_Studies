public class Main {
    public static void main(String[] args) {
        // Bir dizi ve dizinin içinde 2 tane kredi manager bulunuyor.
        BaseKrediManager[] krediManagers = new BaseKrediManager[]{
                new OgretmenKrediManager(), new TarımKrediManager(), new OgrenciKrediManager()};
        for (BaseKrediManager krediManager : krediManagers) {
            System.out.println(krediManager.hesapla(1000));
            /*krediManager.hesapla(1000);*/
        }
    }
}