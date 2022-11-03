import java.util.Scanner;
public class HarmonikSayiBulma {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int n ;
        System.out.println("Sayı Giriniz  : ");
        n= input.nextInt();

        double result = 0.0;
        for (int i = 1; i<=n ; i++){ // int yerine double olaarakta  yazabiliriz.

            result += (1.0/i);
        }
        System.out.println(result);
    }
}
