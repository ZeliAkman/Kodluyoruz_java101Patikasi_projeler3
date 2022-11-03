public class birveyuzarasindakiAsalSayilar {
    public static void main(String[] args) {
        for(int i=2;i<=100;i++){
            boolean sayi= true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    sayi=false;
                    break;
                }

            }
            if(sayi){
                System.out.print(" "+i);
            }



        }


    }
}
