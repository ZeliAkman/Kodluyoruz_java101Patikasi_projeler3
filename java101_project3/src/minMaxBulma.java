import java.util.Scanner;
public class minMaxBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int sayi, buyukSayi = 0, kucukSayi = 0;

        System.out.println("Lütfen Kac kere sayı gireceginizi  belirtin: ");
        int z = inp.nextInt();

        for (int i = 1; i <= z; i++) {
            System.out.println("Sayı " + i + ". giriniz:");
            sayi = inp.nextInt();
            if (i == 1) {
                buyukSayi = sayi;
                kucukSayi = sayi;
            } else {
                if (sayi > buyukSayi) {
                    buyukSayi = sayi;
                } else if (sayi < kucukSayi) {
                    kucukSayi = sayi;
                }
            }
        }
        System.out.println("Girdiginiz sayılardan en büyügü: " + buyukSayi);
        System.out.println("Girdiginiz sayılardan en kücügü: " + kucukSayi);
    }
}
