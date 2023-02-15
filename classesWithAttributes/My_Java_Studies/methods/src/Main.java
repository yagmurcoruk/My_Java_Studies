public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        String yenimesaj = mesaj.substring(0, 2); // substring bir değer döndürür void değildir.
        System.out.println(yenimesaj);
        int sayi = topla(5,7);
        System.out.println(sayi);
        String text = sehirGonder();
        System.out.println(text);
        int toplam = topla2(2,0,5,8,5,10);
        System.out.println(toplam);

    }
    // void fonksiyonlar sadece işlem yapar ekle sil ya da güncelle gibi işlemler..Datayı istediğimizde void olamaz.
    public static void ekle() {
        System.out.println("eklendi");
    }

    public static void sil() {
        System.out.println("silindi");
    }

    public static void guncelle() {
        System.out.println("güncellendi");
        return;  // bitir anlamına gelir
    }

    // datayı geri döndüren fonksiyonlat void değildir.
    public static int topla(int sayi1,int sayi2){      // integer türünde bir değer döndürür.
       int toplam = sayi1+sayi2;
       return toplam;
    }

    public static int topla2(int... sayilar){   // int dan sonra ... koymak istediğiniz kadar sayı gönderebilirsin anlamına gelir.
        int toplam=0;
        for (int  sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }
    public static String sehirGonder() {      // integer türünde bir değer döndürür.
        return "Ankara";
    }
}