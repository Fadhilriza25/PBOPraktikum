
package TugasPrakP5;

public class HalfFull_Triangel {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            // Half Triangle
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            System.out.print("     ");

            // Full Triangle
            if (i == 1 || i == 5) {
                System.out.print("  ");
                System.out.println("*");
            } else if (i == 2 || i == 4) {
                System.out.print(" ");
                System.out.println("***");
            } else {
                System.out.println("*****");
            }
        }
    }
}
