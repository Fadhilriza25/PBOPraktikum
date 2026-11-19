package Tugasprak6PBO;


import java.util.Scanner;

public class soal_8 extends Thread {

    int nomor;

    public soal_8(int nomor) {
        this.nomor = nomor;
    }

    @Override
    public void run() {
        System.out.println("Thread anak ke-" + nomor + " sedang berjalan");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n;

        System.out.print("Masukan jumlah thread anak: ");
        n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            soal_8 objek = new soal_8(i);
            objek.start();
        }

       
    }
}

