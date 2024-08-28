package A_0828;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main_0015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = -1;

        while (true) {
            try {
                score = sc.nextInt();
                if(score >=0 && score <= 100) break;
                System.out.println("0이상 100이하의 정수를 입력하세요");
            } catch (InputMismatchException e) {
                System.out.println("Error : Please enter a valid integer");
                sc.next();
            }
        }
        sc.close();
        
        if ( score >= 90) System.out.println("A");
        else if ( score >= 80 ) System.out.println("B");
        else if ( score >= 70 ) System.out.println("C");
        else if ( score >= 60 ) System.out.println("D");
        else System.out.println("F");
    }
}
