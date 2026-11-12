
package TugasPrakP4PBO;

import java.util.Scanner;

public class KodeHari {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        char kode_hari;
        System.out.print("Masukan kode hari (1-7) : ");
        kode_hari = i.nextLine().charAt(0);
        
        if(kode_hari == '1'){
            System.out.println("kode hari " + kode_hari + " merupakan hari senin");
        }else if(kode_hari == '2'){
            System.out.println("kode hari " + kode_hari + " merupakan hari selasa");
        }else if(kode_hari == '3'){
            System.out.println("kode hari " + kode_hari + " merupakan hari rabu");
        }else if(kode_hari == '4'){
            System.out.println("kode hari " + kode_hari + " merupakan hari kamis");
        }else if(kode_hari == '5'){
            System.out.println("kode hari " + kode_hari + " merupakan hari jumat");
        }else if(kode_hari == '6'){
            System.out.println("kode hari " + kode_hari + " merupakan hari sabtu");
        }else if(kode_hari == '7'){
            System.out.println("kode hari " + kode_hari + " merupakan hari minggu");
        } else {
            System.out.println("Masukan kode hari yang sesuai!");
        }
    }
}
