package A_0903;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_0027 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int count = Integer.parseInt(reader.readLine());
            String[] inputs = new String[count];

            for(int i = 0; i < count; i++) {
                inputs[i] = reader.readLine();
                writer.write(calculate(i, inputs[i]));
            }
            writer.flush();            
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static String calculate(int i, String input) {
        String[] parts = input.split(" ");
        int sum = Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]);

        return "Case #" + (i+1) + ": " + sum + "\n";
    }
 }
