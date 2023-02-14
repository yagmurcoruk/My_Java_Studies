public class Main {
    public static void main(String[] args) {

        //array yazmanın bir diğer yöntemi süslü parantez açıp değerleri yazmaktır. double[] myList = {1,2,3,4};
        double[] myList = {1.2, 1.3, 6.7, 5.6};
        double total = 0.0;
        double max = myList[0];

        for (double number : myList) {
            System.out.println(number);
        }
        // toplamı bulmak için kodlar aşağıdaki gibidir.
        for (double number : myList) {
            total += number;
        }
        System.out.println("verilen sayilarin toplami : " + total);
        if (max < myList[1]) {
            max = myList[1];
        }
        if (max < myList[2]) {
            max = myList[2];
        }
        if (max < myList[3]) {
            max = myList[3];

        }
        System.out.println("en buyuk sayi : " + max);
    }
}