
package TugasPrakP5;

import java.util.Scanner;

public class NilaiMinMax {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int bilangan;
        int angka_max = Integer.MAX_VALUE;
        int angka_min = Integer.MIN_VALUE;  
        for (int i=0 ; i<10 ; i++){
            System.out.print("Masukan angka ke-" + (i+1) + " : ");
            bilangan = s.nextInt();

            if (i == 0) {
                angka_max = bilangan;
                angka_min = bilangan;
            } else {
                if (bilangan > angka_max) {
                    angka_max = bilangan;
                }

                if (bilangan < angka_min) {
                    angka_min = bilangan;
                }
            }
        }

        System.out.println("\nAngka terbesar = " + angka_max);
        System.out.println("Angka terkecil = " + angka_min);
        
    }
}
