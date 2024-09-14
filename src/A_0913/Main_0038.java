package A_0913;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_0038 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputLine = reader.readLine().split(" ");
        int basketCount = Integer.parseInt(inputLine[0]);
        int changeCount = Integer.parseInt(inputLine[1]);

        int[] basket = new int[basketCount];
        for(int i = 0; i < basketCount; i++) {
            basket[i] = i + 1;
        }

        for(int i = 0; i < changeCount; i++) {
            String[] changeInput = reader.readLine().split(" ");
            int firstNumber = Integer.parseInt(changeInput[0]);
            int lastNumber = Integer.parseInt(changeInput[1]);

            int temp = basket[firstNumber - 1];
            basket[firstNumber - 1] = basket[lastNumber - 1];
            basket[lastNumber - 1] = temp;
        }

        for (int i = 0; i < basketCount; i++) {
            writer.write(basket[i] + " ");
        }
        writer.flush();
    }
}
