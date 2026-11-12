
package TugasPrakP4PBO;

import java.util.Scanner;

public class LuasBangunan {
    public static void main(String[] args) {
        int pilih;
        double luas;
        Scanner i = new Scanner (System.in);
        System.out.println("========Program Luas Bangunan========");
        System.out.println("1.Hitung Luas Persegi\n2.Hitung Luas segitiga\n3.Hitung Luas Lingkaran\n4.Hitung Luas Trapesium\n5.Hitung Luas Layang2\n0.Keluar");
        System.out.print("Pilih (0-5) : ");
        pilih = i.nextInt();
        
        switch (pilih) {
            case 1 :
                double s;
                System.out.print("Masukan Nilai Sisi Persegi : ");
                s = i.nextDouble();
                luas = s * s;
                System.out.println("Luas Persegi : " + luas);
                break;
            case 2 :
                double a,t;
                System.out.print("Masukan Nilai Alas Segitiga : ");
                a = i.nextDouble();
                System.out.print("Masukan Nilai Alas Segitiga : ");
                t = i.nextDouble();
                luas = 0.5 * a * t;
                System.out.println("Luas Segitiga : " + luas);
                break;
            case 3 :
                final double phi = 3.14;
                double r;
                System.out.print("Masukan Nilai Jari2 : ");
                r = i.nextDouble();
                luas = phi * r * r;
                System.out.println("Luas Lingkaran : " + luas);
                break;
            case 4 :
                double x, y, tp;
                System.out.print("Masukan Nilai Panjang sisi x : ");
                x = i.nextDouble();
                System.out.print("Masukan Nilai Panjang sisi y : ");
                y = i.nextDouble();
                System.out.print("Masukan Nilai Tinggi Trapesium : ");
                tp = i.nextDouble();
                luas = 0.5 * (x + y) * tp;
                System.out.println("Luas Trapesium : " + luas);
                break;
            case 5 :
                double d1, d2;
                System.out.print("Masukan Panjang Diagonal Pertama : ");
                d1 = i.nextDouble();
                System.out.print("Masukan Panjang Diagonal Kedua : ");
                d2 = i.nextDouble();
                luas = 0.5 * d1 * d2;
                System.out.println("Luas Layang2 : " + luas);
                break;
            default :
                System.out.println("Anda Keluar Program");
                break;
        }
    }
}
