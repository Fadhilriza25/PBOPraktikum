
package Tugasprak6PBO;

import java.util.Scanner;

public class soal_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.print("Masukan jumlah array : ");
        n = s.nextInt();
        
        String[] nama = new String[n];
        int[] nilai = new int[n];
        String[] status = new String[n];
        s.nextLine();
        
        for (int i = 0; i < n; i++) {
            System.out.print("Masukan nama ke-" + i + " : ");
            nama[i] = s.nextLine();
            System.out.print("Masukan nilai ke-" + i + " : ");
            nilai[i] = s.nextInt();
            s.nextLine();
        }
        for (int i = 0; i < n; i++) {
            if (nilai[i] >= 0 && nilai[i] <=100) {
                if (nilai[i] <= 50){
                status[i] = "Tidak Lulus";
                } else {
                    status[i] = "Lulus";
                }
            }
        }
        System.out.println("\n          Daftar Nilai Mahasiswa");
        System.out.println("------------------------------------------------------");
        System.out.printf("%-3s %-20s %-6s %-12s\n",
        "No", "Nama", "Nilai", "Status");
       System.out.println("------------------------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-3d %-20s %-6d %-12s\n",
        (i+1), nama[i], nilai[i], status[i]);
        }
        System.out.println("------------------------------------------------------");
    }
}
