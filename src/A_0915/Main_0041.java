package A_0915;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_0041 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] initInput = reader.readLine().split(" ");

        int basketCount = Integer.parseInt(initInput[0]);
        int changeCount = Integer.parseInt(initInput[1]);
        int[] basket = new int[basketCount];

        for(int i = 0; i < basketCount; i++) {
            basket[i] = i+1;
        }

        for(int i = 0; i < changeCount; i++) {
            String[] changeInput = reader.readLine().split(" ");
            int firstIndex = Integer.parseInt(changeInput[0])-1;
            int lastIndex = Integer.parseInt(changeInput[1])-1;

            while (firstIndex < lastIndex) {
                int temp = basket[firstIndex];
                basket[firstIndex] = basket[lastIndex];
                basket[lastIndex] = temp;
                firstIndex += 1;
                lastIndex -= 1;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int num : basket) {
            sb.append(num).append(" ");
        }
        System.out.println(sb);
    }
}
