package A_0827;

import java.util.Scanner;

public class Main_0010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int res1 = A*(B%100%10);
        int res2 = A*(B%100/10);
        int res3 = A*(B/100);
        int res4 = A*B;
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);

        sc.close();
    }
}
