
package TugasPrakp3;

import java.io.*;
public class Hitung_Belanja {

    public static void main(String[] args) {
        try {
            DataInputStream dis = new DataInputStream(System.in);

            // Input data dari user
            System.out.print("Nama: ");
            String nama = dis.readLine();

            System.out.print("Total Belanja: ");
            double totalBelanja = Double.parseDouble(dis.readLine());

            System.out.print("Diskon (%): ");
            double diskon = Double.parseDouble(dis.readLine());

            double total = totalBelanja - (totalBelanja * diskon / 100);

            System.out.print("Bayar: ");
            double bayar = Double.parseDouble(dis.readLine());

            double kembalian = bayar - total;

            // Simpan ke file dengan DataOutputStream
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("belanja.txt"));
            dos.writeUTF(nama);
            dos.writeDouble(totalBelanja);
            dos.writeDouble(diskon);
            dos.writeDouble(total);
            dos.writeDouble(bayar);
            dos.writeDouble(kembalian);
            dos.close();

            // Baca kembali dari file dengan DataInputStream
            DataInputStream fileDis = new DataInputStream(new FileInputStream("belanja.txt"));
            System.out.println("\n===== STRUK PEMBELANJAAN =====");
            System.out.println("Nama          : " + fileDis.readUTF());
            System.out.println("Total Belanja : " + fileDis.readDouble());
            System.out.println("Diskon (%)    : " + fileDis.readDouble());
            System.out.println("Total         : " + fileDis.readDouble());
            System.out.println("Bayar         : " + fileDis.readDouble());
            System.out.println("Kembalian     : " + fileDis.readDouble());
            System.out.println("==============================");

            fileDis.close();

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }

}
