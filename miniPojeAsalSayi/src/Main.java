public class Main {
    public static void main(String[] args) {

        int number = -2;
        int remainder = number % 2;
        boolean isPrime = true;

        if (number == 1 ){
            System.out.println("sayi asal değildir.");
            return;
        }
        if (number < 1 ){
            System.out.println("Gecersiz sayi!!");
            return;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("sayi asaldir.");
        } else {
            System.out.println("sayi asal değildir.");
        }
    }
}