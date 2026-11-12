
package TugasPrakP5;

import java.util.Scanner;

public class Penjumlahan_RataRata {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, angka, total = 0;
        double rata;
        System.out.print("Berapa banyak penjumlahan yang akan dilakukan? : ");
        n = s.nextInt();
        
        for (int i=0 ; i<n ; i++){
            System.out.print("Masukan angka ke-" + (i+1) + " : ");
            angka = s.nextInt();
            total += angka;
        }
        rata = total/n;
        System.out.println("\nTotal penjumlahan = " + total);
        System.out.println("Rata-rata = " + rata);
    }
}
