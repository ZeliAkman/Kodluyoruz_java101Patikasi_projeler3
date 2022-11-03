import java.util.Scanner;

public class giriliensayilardakiciftibulma {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int k ;
        System.out.println("Girmek istediğiniz sayı : ");
        k= input.nextInt();

        for (int i=0;i<=k;i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
