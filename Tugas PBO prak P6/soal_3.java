
package Tugasprak6PBO;

import java.util.Scanner;

public class soal_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Masukan panjang array : ");
        n = s.nextInt();
        int[] angka = new int[n];
        for (int i=0 ; i<n ; i++){
            System.out.print("Masukan nilai array ke-"+ i + " : ");
            angka[i] = s.nextInt();
        }
        int max = angka[0];
        int min = angka[0];
        int indexMax = 0;
        int indexMin = 0;
        
        for (int i=0 ; i<angka.length ; i++){
            if (angka[i] > max){
                max = angka[i];
                indexMax = i;
            }
            if (angka[i] < min){
                min = angka[i];
                indexMin = i;
            }
        }
        System.out.println("Nilai array terbesar = " + max + " yang berada di index ke-" + indexMax);
        System.out.println("Nilai array terkecil = " + min + " yang berada di index ke-" + indexMin);
        
        int jumlah = 0;
        double rata = 0;
        for (int i = 0; i < angka.length; i++) {
            jumlah += angka[i];
        }
        rata = jumlah / n;
        System.out.println("Jumlah = " + jumlah);
        System.out.println("Rata rata = " + rata);
        
        long npm;
        System.out.print("Masukan npm anda : ");
        npm = s.nextLong();
        
        if (npm % 2 == 0) {
            System.out.println("Cari index ganjil lalu jumlahkan nilai arraynya");
        }
        
        int jumlah1 = 0;
        for (int i = 0; i < angka.length; i++) {
            if (i % 2 == 1){
                jumlah1 += angka[i];
            }
                
        }
        
        System.out.println("Hasil penjumlahan indeks ganjil : " + jumlah1);
        
        if (jumlah1 % 2 == 0){
            System.out.println("Hasil penjumlahan genap");
        } else {
            System.out.println("Hasil penjumlahan ganjil");
        }
        
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (angka[j] > angka[j + 1]) {
                    int value = angka[j];
                    angka[j] = angka[j + 1];
                    angka[j + 1] = value;
                }
            }
        }

        System.out.println("\nArray setelah diurutkan:");
        for (int i = 0; i < n; i++) {
            System.out.print(angka[i] + " ");
        }
        System.out.println("");
    }  
}
