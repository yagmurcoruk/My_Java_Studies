import javax.swing.plaf.synth.SynthLookAndFeel;

public class Main {
    public static void main(String[] args) {
    int sayi = 22;
    if (sayi<20){
        System.out.println("Sayi 20'den küçüktür. ");
    }
    else if (sayi<21) {
        System.out.println("sayi 21'den küçüktür.");
    }
    else if (sayi==22) {
        System.out.println("sayınız 22'ye eşittir. ");
    }
    else{
        System.out.println("sayiniz şartları sağlamadı.Sayınız:"+sayi);
    }
    }
}