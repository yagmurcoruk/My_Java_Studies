public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        int sonuc1 = dortIslem.topla(3,4);
        System.out.println(sonuc1);
        int sonuc2 = dortIslem.carp(3,4);
        System.out.println(sonuc2) ;
        int sonuc3 = dortIslem.cikar(3,4);
        System.out.println(sonuc3);
        int sonuc4 = dortIslem.bol(6,3);
        System.out.println(sonuc4);
    }
}