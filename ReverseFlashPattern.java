import java.util.Scanner;

public class ReverseFlashPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int h = 0;
        int k = 2;
        for (int i = 1; i <= (2 * n) - 1; i++) {
            if (i < n) {
                for (int j = 1; j <= i; j++) {
                    if (i != j) {
                        System.out.print("*");
                    } else {
                        System.out.print(j);
                        // System.out.println("i ="+i +" "+ " j ="+j);
                    }
                }
                System.out.println();
            } else if (h >= i) {
                // System.out.println(i +" "+ h);

                for (int j = 1; j <= k; j++) {
                    if (j != k) {
                        System.out.print("*");
                    } else {
                        System.out.print(h);
                    }

                }
                h++;
                k++;
                System.out.println();
            } else {
                h = ((2 * n));
                for (int j = ((2 * n) - 1); j >= i; j--) {
                    System.out.print(j);
                    // System.out.println("i ="+i +" "+ " j ="+j);

                }
                System.out.println();
            }
        }
    }
}
