import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {

        String mesaj = "Bugün hava çok güzel";
        System.out.println(mesaj);
     /*   System.out.println("eleman sayısı : " + mesaj.length());
        System.out.println("5.eleman : " + mesaj.charAt(4)); // charAt spesifik index bulduran fonksiyondur.
        System.out.println(mesaj.concat(" yaşasın!")); // concat yazdığımmesajla belirttiğimiz mesajı birleştirir.
        String mesaj2 = mesaj.concat(" yaşasınnn");
        System.out.println(mesaj2);
        System.out.println(mesaj.startsWith("A")); // startsWith belirttiğimiz harfla başlıyorsa "True" değilse "False" döndürür.
        System.out.println(mesaj2.endsWith("n")); // büyük harf küçük harf duyarlıdır.
        char[] karakterler = new char[25];
        mesaj.getChars(0,5,karakterler,0); // 0 dan 4 kadar mesaj da yazan harfleri 0.indisten başlarak karakterler dizisine ata.
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('a')); // a karakterinin kaçıncı indexte olduğnu verir.
        System.out.println(mesaj.lastIndexOf('a'));  // sağdan başlayarak kaçıncı indekste olduğunu verir.
        */

        System.out.println(mesaj.replace(' ', '-')); // bir karakteri değiştirmek istediğimiz karakte dönüştürebiliriz.

        String yeniMesaj = mesaj.replace(' ', '-');  // yeni bir değişken olarak atayabiliriz.
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2)); // belirttiğimiz string index'inden başlarayak sonrasını yazdırır.
        System.out.println(mesaj.substring(2, 5)); // 2 den başlayarak 2 de dahil 4 e kadar yaz.4 dahil değil.
        System.out.println(mesaj.toLowerCase());  // bütün büyük harfleri küçük harfe çevirir.
        System.out.println(mesaj.toUpperCase()); // bütün küçük harfleri büyük harfe çevirir.
        System.out.println(mesaj.trim()); // mesajın başında ve sonunda bulunan boşlukları atar.
    }
}