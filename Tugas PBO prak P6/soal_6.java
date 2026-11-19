
package Tugasprak6PBO;

import java.util.Scanner;

public class soal_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int jumlah;
        System.out.print("Masukkan jumlah bilangan: ");
        jumlah = s.nextInt();

        int[] angka = new int[jumlah];
        double total = 0;
        for (int i = 0; i < jumlah; i++) {
            try {
                System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
                angka[i] = s.nextInt();

                total += angka[i];

            } catch (Exception e) {
                System.out.println("Inputan harus bilangan!");

                s.next();
                i--;
            }
        }
        double rataRata = total / jumlah;

        System.out.println("\nJumlah seluruh bilangan: " + total);
        System.out.println("rata-rata: " + rataRata);
    }
}
