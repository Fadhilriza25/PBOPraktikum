
package TugasPrakP5;

import java.util.Scanner;

public class Floyd_Triangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        int angka=1;
        System.out.print("Masukan banyak baris : ");
        n = s.nextInt();
        for (int i=0 ; i<=n ;i++){
            for (int j=0 ; j<i ; j++){
                System.out.print(angka + " ");
                angka++;
            }
            System.out.println(" ");
        }
    }
 
}
