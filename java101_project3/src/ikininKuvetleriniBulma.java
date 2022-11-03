import java.util.Scanner;

public class ikininKuvetleriniBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n ;
        System.out.println("Sınır sayısını giriniz : ");
        n= input.nextInt();

        for (int i =1; i<=n ; i*=2){
            System.out.println(i);
        }

    }
}
