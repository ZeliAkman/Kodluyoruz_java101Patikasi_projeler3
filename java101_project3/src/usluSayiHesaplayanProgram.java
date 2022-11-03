import java.util.Scanner;
public class usluSayiHesaplayanProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("üslü hesabı  yapılacak  sayıyı giriniz:");
        int n= input.nextInt();
        System.out.println("üs olacak  sayıyı giriniz:");
        int k= input.nextInt();
        int i = 1;
        int total = 1;
        while (i <= k){
            total *= n;
            i++;
        }
        System.out.println("Sonuç:" + total);

    }
}
