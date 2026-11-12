
package TugasPrakP4PBO;

import java.util.Scanner;

public class GanjilGenaap {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int angka;
        System.out.print("Masukan angka pilihan anda : ");
        angka = i.nextInt();
        
        if(angka % 2 == 0){
            System.out.println("Angka " + angka + " adalah bilangan genap");
        } else {
            System.out.println("Angka " + angka + " adalah bilangan ganjil");
        }
    }
}
