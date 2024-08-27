package A_0826;

import java.util.Scanner;

public class Main_0006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.printf("%d\n%d\n%d\n%d\n%d", A+B, A-B, A*B, A/B, A%B);
        sc.close();
    }
}
