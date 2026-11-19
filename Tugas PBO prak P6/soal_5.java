
package Tugasprak6PBO;

import java.util.Scanner;

public class soal_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int b, k;
        
        System.out.print("Masukan jumlah baris : ");
        b = s.nextInt();
        System.out.print("Masukan jumlah kolom : ");
        k = s.nextInt();
       
        int[][] matrik1 = new int[b][k];
        int[][] matrik2 = new int[b][k];
        int[][] hasil = new int[b][k];
        
        System.out.println("\nMasukan nilai matriks 1");
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                matrik1[i][j] = s.nextInt();
            }
            System.out.println("");
        }
        
        System.out.println("\nMasukan nilai matriks 2");
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                matrik2[i][j] = s.nextInt();
            }
            System.out.println("");
        }
        
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < k; j++) {
                hasil[i][j] = matrik1[i][j] + matrik2[i][j];
            }
            System.out.println("");
        }
        System.out.println("Hasil pertambahan matriks");
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print("[" + hasil[i][j] + "]");
            }
            System.out.println("");
        }
    }
}
