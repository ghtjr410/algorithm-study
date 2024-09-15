package A_0915;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_0045 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int testCase = Integer.parseInt(reader.readLine());

            for(int i = 0; i < testCase; i++){
                String word = reader.readLine();

                writer.write(word.charAt(0));
                writer.write(word.charAt(word.length()-1));
                writer.newLine();
            }
            writer.flush();
        }
    }
}
