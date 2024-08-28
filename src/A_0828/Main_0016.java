package A_0828;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main_0016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = 0;
        while (true) {
            try {
                year = sc.nextInt();
                if(year >= 1 && year <= 4000) break;
                
            } catch (InputMismatchException e) {
                System.out.println("Error : Please enter a valid integer");
                sc.next();
            }
        }
        sc.close();

        if(year%4 == 0 && (year%100 !=0 || year%400 == 0)) System.out.println(1);
        else System.out.println(0);
    }
}
