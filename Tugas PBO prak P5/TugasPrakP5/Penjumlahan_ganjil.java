
package TugasPrakP5;

import java.util.Scanner;

public class Penjumlahan_ganjil {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        int angka = 1;
        int total=0;
        System.out.println("Masukan banyak angka : ");
        n = s.nextInt();
        for (int i=0 ; i<n ; i++){
            System.out.print(angka + " ");
            total += angka; 
            angka+=2;
            
        }
        System.out.println("\nTotal penjumlahan : " + total);
    }
}
