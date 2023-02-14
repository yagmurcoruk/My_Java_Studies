public class Main {
    public static void main(String[] args) {

        int number = 6 ;
        int perfectNumber=0;
        for (int i = 1;i<number;i++){
            if (number%i==0){
                perfectNumber+=i;
            }
        }
        if (perfectNumber==number){
            System.out.println("Bu sayi mukemmel sayidir.");
        }
        else{
            System.out.println("Bu sayi mukemmel sayi degildir.");
        }

    }
}