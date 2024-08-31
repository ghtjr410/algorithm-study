package A_0830;

import java.util.Arrays;
import java.util.Scanner;

// 1~6 랜덤 숫자를 3개를받아야함

public class Main_0020 {
    private final static int DICE_COUNT = 3;
    private final static int TEN_THOUSAND = 10000;
    private final static int THOUSAND = 1000;
    private final static int HUNDRED = 100;
    private final static int DICE_LOWER_BOUND = 1;
    private final static int DICE_UPPER_BOUND = 6;


    public static void main(String[] args) {        
        int[] rolledValues = new int[6];
        Arrays.fill(rolledValues, 0);
        
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < DICE_COUNT; i++){
            rolDice(rolledValues, sc);
        }

        int score = calculateScore(rolledValues);
        System.out.println(score);


    }
    private static void rolDice(int[] rolledValues, Scanner sc) {
        int value =1;
        while (true) {            
            value = sc.nextInt();

            if( value >= DICE_LOWER_BOUND && value <= DICE_UPPER_BOUND){
            rolledValues[value-1] += 1;
            break;
            }
        }
    }
    private static int calculateScore(int[] rolledValues ) {
        for (int i = 0; i < rolledValues.length; i++) {
            if (rolledValues[i] == 3) {
                return TEN_THOUSAND + (i + 1) * THOUSAND;
            } else if (rolledValues[i] == 2) {
                return THOUSAND + (i + 1) * HUNDRED;
            }
        }

        for (int i = rolledValues.length - 1; i >= 0; i--) {
            if (rolledValues[i] == 1) {
                return (i + 1) * HUNDRED;
            }
        }

        return 0; 
    }
}
