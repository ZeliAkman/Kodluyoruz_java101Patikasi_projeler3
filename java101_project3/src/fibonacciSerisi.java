import java.util.Scanner;
public class fibonacciSerisi {
    public static void main(String[] args) {
        int number1 = 0;
        int number2 = 1;
        int k, number3;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        k = sc.nextInt();

        for (int i = 2; i <= k; i++) {
            number3 = number1 + number2;
            System.out.print(number1 + " + " + number2 + " = " + number3);
            number1 = number2;
            number2 = number3;
            System.out.println();
        }
    }
}
