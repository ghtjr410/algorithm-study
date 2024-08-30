package A_0829;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main_0019 {
    private final static int ZERO = 0;
    private final static int HOUR_UPPER_BOUND = 24;
    private final static int MINUTE_UPPER_BOUND = 60;
    private final static int COOK_UPPER_BOUND = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] currentTime = getCurrentTime(sc);
        int cookTime = getCookTime(sc);
        sc.close();

        int[] cookFinishTime = getCookFinishTime(currentTime, cookTime);
        System.out.println(cookFinishTime[0] + " " + cookFinishTime[1]);
    }

    private static int[] getCurrentTime(Scanner sc) {
        int[] currentTime = new int[2];
        currentTime[0] = getValidHour(sc);
        currentTime[1] = getValidMinute(sc);

        return currentTime;
    }

    private static int getValidHour(Scanner sc) {
        return getValidInput(sc, ZERO, HOUR_UPPER_BOUND);
    }

    private static int getValidMinute(Scanner sc) {
        return getValidInput(sc, ZERO, MINUTE_UPPER_BOUND);
    }

    private static int getValidInput(Scanner sc, int lowerBound, int upperBound) {
        int value = -1;
        while (true) {
            try {
                value = sc.nextInt();
                if (value >= lowerBound && value < upperBound) {
                    break;
                } else {
                    System.out.println("Error: Please enter a valid value between " + lowerBound + " and " + (upperBound - 1));
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid integer.");
                sc.next();  // 잘못된 입력 무시
            }
        }
        return value;
    }

    private static int getCookTime(Scanner sc) {
        return getValidInput(sc, ZERO, COOK_UPPER_BOUND + 1);
    }

    private static int[] getCookFinishTime(int[] currentTime, int cookTime) {
        int hour = currentTime[0];
        int minute = currentTime[1];     

        int cookHour = cookTime / 60;
        int cookMinute = cookTime % 60;
        int totalMinutes = minute + cookMinute;
        int totalHours = hour + cookHour + (totalMinutes / 60);

        int[] cookFinishTime = new int[2];
        cookFinishTime[0] = totalHours % 24;  // 24시간을 초과할 경우 다시 0부터 시작
        cookFinishTime[1] = totalMinutes % 60; // 60분을 초과할 경우 다시 0부터 시작

        return cookFinishTime;
    }
}
