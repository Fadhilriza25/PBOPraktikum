
package TugasPrakP4PBO;

import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) {
        Scanner i = new Scanner (System.in);
        String nama;
        char member;
        double totbel, totbayar, diskon;
        System.out.print("Masukan nama anda : ");
        nama = i.nextLine();
        System.out.print("Apakah anda memiliki kartu member (Y/N) : ");
        member = i.nextLine().charAt(0);
        System.out.print("Berapa total belanja anda? : ");
        totbel = i.nextDouble();
        
        if (member == 'Y' || member =='y'){
            if (totbel > 500000){
                System.out.println("Anda mendapatkan diskon sebesar Rp.50.000");
                diskon = 50000;
                totbayar = totbel - diskon;
            } else if (totbel > 100000){
                System.out.println("Anda mendapatkan diskon sebesar Rp.15.000");
                diskon = 15000;
                totbayar = totbel - diskon;
            } else {
                System.out.println("Anda tidak mendapatkan diskon");
                diskon = 0;
                totbayar = totbel;
            }
        } else if (member == 'N' || member =='n') {
            if (totbel > 100000){
                System.out.println("Anda mendapatkan diskon sebesar Rp.10.000");
                diskon = 10000;
                totbayar = totbel - diskon;
            } else {
                System.out.println("Anda tidak mendapatkan diskon");
                diskon = 0;
                totbayar = totbel;
            }
        } else {
            System.out.println("Pilih yang benar!");
            return;
        }
        System.out.println("\nNama pembeli : " + nama);
        System.out.println("Punya member? : " + member);
        System.out.println("Total beli : Rp." + totbel);
        System.out.println("Diskon : Rp." + diskon);
        System.out.println("Total Bayar : Rp." + totbayar);
    }
}
