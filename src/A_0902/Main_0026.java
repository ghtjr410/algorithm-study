package A_0902;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_0026 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int count = Integer.parseInt(reader.readLine());
            
            String[] inputs = new String[count];
            for (int i = 0; i < count; i++) {
                inputs[i] = reader.readLine();
                writer.write(calculateSum(inputs[i]) + "\n");
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

    private static int calculateSum(String input) {
        String[] parts = input.split(" ");
        
        return Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]);
    }
}