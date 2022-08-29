import java.util.Scanner;

public class MukemmelSayi {

    public static void main(String[] args) {
        // Mükemmel Sayı

        int sayi;
        //int bol = 0;
        int toplam = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen işlem yapmak istediðiniz sayiyi giriniz : ");
        sayi = scan.nextInt();

        if(sayi<0) {
            System.out.print("Lütfen pozitif bir tam sayı giriniz !");
        }else {
            for(int i = 1; i<sayi; i++) {
                if(sayi % i == 0) {
                    toplam += i;
                }
            }


        }

        if(toplam == sayi) {
            System.out.print(sayi + " Sayısı mükemmel bir sayıdır :)");
        }else {
            System.out.print(sayi + " Sayısı mükemmel bir sayı değildir :( ");
        }


    }

}