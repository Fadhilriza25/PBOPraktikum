
package TugasPrakP4PBO;

import java.util.Scanner;

public class GajiPegawai {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        String nik, nama, keterangan;
        int jumlahAnak = 0;
        char kode_golongan;
        double gajiBersih, gajiPokok, tunjangan, tunjanganPasangan, tunjanganAnak;
        
        System.out.print("Masukan Nik Pegawai : ");
        nik = i.nextLine();
        System.out.print("Masukan Nama Pegawai : ");
        nama = i.nextLine();
        System.out.print("Masukan kode golongan Pegawai : ");
        kode_golongan = i.nextLine().charAt(0);
           
        if(kode_golongan == '1'){
            keterangan = "Menikah";
            gajiPokok = 1200000;
        }else if(kode_golongan == '2'){
            keterangan = "Belom Menikah";
            gajiPokok = 1500000;
            tunjanganPasangan = 0;
        }else if(kode_golongan == '3'){
            keterangan = "Cerai";
            gajiPokok = 1750000;
            System.out.print("Masukan jumlah anak : ");
            jumlahAnak = i.nextInt();
            
            if(jumlahAnak < 0){
                System.out.println("Masukan jumlah anak yang benar!");
                return;
            }
        }else if(kode_golongan == '4'){
            keterangan = "Menikah dan punya anak";
            gajiPokok = 2000000;
            System.out.print("Masukan jumlah anak : ");
            jumlahAnak = i.nextInt();
            
            if(jumlahAnak <=0){
                System.out.println("Masukan jumlah anak yang benar!");
                return;
            }
        } else {  
            System.out.println("Masukan kode golongan yang benar");
            return;
        }
        if (kode_golongan == '2') {
            tunjanganPasangan = 0;
        } else {
            tunjanganPasangan = 0.10 * gajiPokok;
        }
        
        tunjanganAnak = 0.05 * gajiPokok * jumlahAnak;
        tunjangan = tunjanganAnak + tunjanganPasangan;
        gajiBersih = gajiPokok + tunjangan;
        
        System.out.println("\nNik karyawan : " + nik);
        System.out.println("Nama karyawan : " + nama);
        System.out.println("Kode golongan karyawan : " + kode_golongan);
        System.out.println("Status pernikahan : " + keterangan);
        System.out.println("Jumlah anak : " + jumlahAnak);
        System.out.println("Gaji pokok : " + gajiPokok);
        System.out.println("Tunjangan pasangan : " + tunjanganPasangan);
        System.out.println("Tunjangan anak : " + tunjanganAnak);
        System.out.println("Tunjangan : " + tunjangan);
        System.out.println("Gaji bersih : " + gajiBersih);
        
   }
}
