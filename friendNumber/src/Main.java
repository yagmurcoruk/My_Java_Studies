public class Main {
    public static void main(String[] args) {

        // Bilinen en küçük iki arkadaş sayi 220 ve 284'dür. Kendileri hariç + tam bölemleri toplamı birbirine eşit sayılardır.

        int sayi1 = 220;
        int sayi2 = 284;
        int toplam1 = 0;
        int toplam2 = 0;

        for (int i = 1; i < sayi1; i++) {
            if (sayi1 % i == 0) {
                toplam1 += i;
            }
        }
        for (int j = 1; j < sayi2; j++) {
            if (sayi2 % j == 0) {
                toplam2 += j;
            }
        }
        if (sayi1 == toplam2) {
            if (sayi2 == toplam1) {
                System.out.println("Bu verilen iki sayi,arkadaş sayidir.");
            }
        } else {
            System.out.println("Bu iki sayi, arkadaş sayi değildir.");
        }
    }
}