package A_0828;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main_0017 {

    private static final int LOWER_BOUND = -1000;
    private static final int UPPER_BOUND = 1000;
    private static final int ZERO = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;   
        
        x = getVaildInput(sc);
        y = getVaildInput(sc);

        sc.close();

        int result = calculateResult(x,y);
        System.out.println(result);
    }

    private static int getVaildInput (Scanner sc) {
        int value;
        while (true) {
            try {
                value = sc.nextInt();
                if(isValid(value)) {
                    break;
                } else {
                    System.out.println("Error: -1000 <= 입력값 <= 1000; 입력값 != 0");
                }
                
            } catch (InputMismatchException e) {
                System.out.println("Error : Please Enter a Valid Integer");
                sc.next();
            }
        }
        return value;
    }

    private static boolean isValid (int value) {
        return (value >= LOWER_BOUND && value <= UPPER_BOUND) && value != ZERO;
    }

    private static int calculateResult(int x, int y) {
        if (x > 0 && y > 0) {
            return 1; // 제1사분면
        } else if (x < 0 && y > 0) {
            return 2; // 제2사분면
        } else if (x < 0 && y < 0) {
            return 3; // 제3사분면
        } else {
            return 4; // 제4사분면
        }
    }
}

