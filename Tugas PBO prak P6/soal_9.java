
package Tugasprak6PBO;

public class soal_9 {
    public static void main(String[] args) {
        int[] age = {12, 4, 5, 2, 6};
        
        //cara 1
        for (int i = 0; i < age.length; i++) {
            System.out.print(age[i] + " ");
        }
        System.out.println("");
        //cara 2
        for (int a : age){
            System.out.print(a + " ");
        }
        System.out.println("");
    }
}
