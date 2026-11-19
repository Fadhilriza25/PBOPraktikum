
package Tugasprak6PBO;

public class soal_7 extends Thread {

    @Override
    public void run() {
        System.out.println("Thread sedang berjalan");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Perulangan ke-" + i);
        }
    }

    public static void main(String[] args) {
        soal_7 objek = new soal_7();

        objek.start();
    }
}
