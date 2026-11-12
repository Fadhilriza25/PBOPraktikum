
package TugasPrakP4PBO;

import java.util.Scanner;

public class TahunKabisat {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int tahun;
        System.out.print("Masukan tahun : ");
        tahun = i.nextInt();
        
        if (tahun < 0){
            System.out.println("Masukan tahun yang benar!");
            return;
        } else {
            if (tahun % 4 == 0){
                System.out.println("Tahun " + tahun + " merupakan tahun kabisat");
            } else {
                System.out.println("Tahun " + tahun + " bukan tahun kabisat");
            }
        }
    }
}
