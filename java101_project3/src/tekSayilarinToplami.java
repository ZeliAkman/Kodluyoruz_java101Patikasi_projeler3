import java.util.Scanner;
public class tekSayilarinToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a , toplam= 0;

        do{
            System.out.println("Sayı giriniz: ");
            a = input.nextInt();
            if (a % 2 == 1){

                toplam += a;
            }
        }while (a>0);

        System.out.println("sayılarımızın toplamı : "+toplam);


    }
}
