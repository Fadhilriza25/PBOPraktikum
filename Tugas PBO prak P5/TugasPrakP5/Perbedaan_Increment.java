
package TugasPrakP5;

public class Perbedaan_Increment {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("i++ -> nilai dulu ditambah");
        while (i < 5) {
            System.out.println(i++);
        }
        int j = 0;
        System.out.println("\n++i -> tambah dulu baru gunakan nilai");
        while (j < 5) {
            System.out.println(++j);
        }
        
    }
}
