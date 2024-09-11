package A_0912;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main_0037 {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {

            String[] inputLine = reader.readLine().split(" ");
            int basketCount = Integer.parseInt(inputLine[0]);
            int ballCount = Integer.parseInt(inputLine[1]);

            int[] basket = new int[basketCount];
            Arrays.fill(basket, 0);

            for (int i = 0; i < ballCount; i++) {
                String[] input = reader.readLine().split(" ");
                int startIndex = Integer.parseInt(input[0]) - 1;
                int endIndex = Integer.parseInt(input[1]);
                int ballNumber = Integer.parseInt(input[2]);

                Arrays.fill(basket, startIndex, endIndex, ballNumber);
            }

            for (int i = 0; i < basketCount; i++) {
                writer.write(basket[i] + " ");
            }
            writer.flush();
        }
    }
}
