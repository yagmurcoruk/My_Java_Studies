public class Main {
    public static void main(String[] args) {
        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel : Geçtiniz.");
                break;
            case 'B':
                System.out.println("Çok güzel : Geçtiniz");
                break;
            case 'C':
            case 'D':
                System.out.println("İyi : Geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef kaldınız.");
                break;
            default:
                System.out.println("Geçersiz not girdiniz.");
        }
    }
}