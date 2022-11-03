import java.util.Scanner;
public class ArmstrongSayıKavrami {
    public static void main(String[] args) {
      /*  Scanner input = new Scanner(System.in);
        System.out.println("Kontrol edilecek sayıyı giriniz :");
        int a = input.nextInt();
        int basamakSayisi = 0, numberCount=0;

        System.out.println(a);
        // 5621 / 10 = 562  => integar bölü integer bize integer bir sonuç verir sondaki elemlnlar kaldrıyoruz
        //562 / 10 = 56
        //56 / 10=5
        // 5 / 10 = 0

        while(a != 0){
            a /=10;
            System.out.println(a);
            numberCount++;
        }
        System.out.println(numberCount); */

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int number = input.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;
        int basPow;

        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            // 1*1*1*1 = 1^4
            basPow = 1;
            for (int i = 1; i <= basNumber; i++) {
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(number + " sayısı bir Armstrong sayısı değildir.");
        }


    }
}
