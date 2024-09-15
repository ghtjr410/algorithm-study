package A_0916;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_0056 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int max = Integer.parseInt(reader.readLine());

            for (int row = 1; row <= max; row++) {
                String line = "";
                for (int col = 1; col <= max - row; col++) {
                    line += " ";
                }
                for (int col = 1; col <= 2 * row - 1; col++) {
                    line += "*";
                }
                System.out.println(line);
            }

            for (int row = max - 1; row > 0; row--) {
                String line = "";
                for (int col = 1; col <= max - row; col++) {
                    line += " ";
                }
                for (int col = 1; col <= 2 * row - 1; col++) {
                    line += "*";
                }
                System.out.println(line);
            }
        }
    }
}
