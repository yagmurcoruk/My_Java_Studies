public class Main {
    public static void main(String[] args) {

        int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak = 5;
        boolean varMi= false;

        for (int i=0;i<=sayilar.length;i++){
            if (aranacak==sayilar[i]){
                varMi = true;
                break;
            }
        }
        if (varMi){
            System.out.println("Aranan sayi bulundu.");
        }
        else{
            System.out.println("Aranan sayi bulunamadı.");
        }


    }
}