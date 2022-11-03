import java.util.Scanner;
public class EbobEkokBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2;
        boolean a = false;
        do {
            System.out.print("Enter Your First Number : ");
            n1 = input.nextInt();
            System.out.print("Enter Your Second Number : ");
            n2 = input.nextInt();
            if (n1 <= 0 || n2 <= 0) {
                System.out.println("Please Enter Positive Number!!");
            } else {
                a = true;
            }
        } while (!a);
        if (n2 < n1) {
            int tempN2 = n2;
            n2 = n1;
            n1 = tempN2;
        }
        int i = n1;
        while (i >= 1) {
            if ((n1 % i == 0) && (n2 % i == 0)) {
                System.out.println("OBEB : " + i);
                break;
            } else {
                i--;
            }
        }
        int k = n2;
        while (k <= (n1 * n2)) {
            if ((k % n1 == 0) && (k % n2 == 0)) {
                System.out.println("OKEK : " + k);
                break;
            } else {
                k++;
            }
        }
    }
}
