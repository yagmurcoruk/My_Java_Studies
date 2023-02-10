public class Main {
    public static void main(String[] args) {

        int sayi1 = 40;
        int sayi2 = 25;
        int sayi3 = 2;
        int enBuyuk = sayi1;

        // En büyük sayıyı nasıl bulabiliriz?
        if (enBuyuk<sayi2) {
            enBuyuk = sayi2;
        } else if (enBuyuk<sayi3) {
            enBuyuk = sayi3;
        }
        else{
            System.out.println("En büyük sayı sayi1'dir." +sayi1);
        }
        System.out.println("En büyük sayi : "+enBuyuk);
    }
}