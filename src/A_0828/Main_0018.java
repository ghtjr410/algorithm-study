package A_0828;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main_0018 {
    private static final int ZERO = 0;
    private static final int HOUR_UPPER_BOUND = 24;
    private static final int MINUTE_UPPER_BOUND = 60;
    private static final int MINUS_MINUTE = 45;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = getVaildHour(sc);
        int minute = getVaildMinute(sc);

        sc.close();
        
        int[] result = calculateResult(hour, minute);
        System.out.println(result[0] + " " + result[1]);
    }

    private static int getVaildHour(Scanner sc) { 
        int hour;
        
        while (true) {
            try {
                hour = sc.nextInt();
                if (isVaildHour(hour)) break;
                
            } catch (InputMismatchException e) {
                System.out.println("Error : Please Enter a Valid Integer");
            }            
        }
        return hour;
    }
    private static int getVaildMinute(Scanner sc) { 
        int minute;
        while (true) {
            try {
                minute = sc.nextInt();
                if (isVaildMinute(minute)) break;
            } catch (InputMismatchException e) {
                System.out.println("Error : Please Enter a Valid Integer");
                sc.next();
            }
        }
        return minute;
    }

    private static boolean isVaildHour (int hour) {
        return hour >= ZERO && hour < HOUR_UPPER_BOUND;
    }

    private static boolean isVaildMinute (int minute) {
        return minute >= ZERO && minute < MINUTE_UPPER_BOUND;
    }

    private static int[] calculateResult(int hour, int minute) {
        int resHour = hour;
        int resMinute = minute;
        
        if (minute < MINUS_MINUTE) {
            resMinute = MINUTE_UPPER_BOUND - (MINUS_MINUTE - minute);
            resHour -= 1;
            if (resHour < 0) {
                resHour = HOUR_UPPER_BOUND - 1;  // 23시로 조정
            }
        } else {
            resMinute -= MINUS_MINUTE;
        }

        return new int[]{resHour, resMinute};
    }
}
