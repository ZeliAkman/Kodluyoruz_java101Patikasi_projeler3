import java.util.Scanner;
public class faktoriyelhesabi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Faktoriyeli hesaplanacak sayıyı giriniz:");
        int n= input.nextInt();
        int total =1;


        for (int i = 1; i<=n ; i++){
            total = total*i;

        }
        System.out.println("Faktöriyel hesabınız : "+total);
    }
}
