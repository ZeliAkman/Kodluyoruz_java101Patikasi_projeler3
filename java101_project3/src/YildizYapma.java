import java.util.Scanner;
public class YildizYapma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = input.nextInt();

        for (int i = 0; i <= n ; i++) {
            for (int k = 0; k < (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i + 1); j++) {
                System.out.print("*");
            }
          System.out.println();
        }
    }
}
