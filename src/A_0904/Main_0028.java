package A_0904;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_0028 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(reader.readLine());

        for(int i = 0; i < count; i++) {
            String input = reader.readLine();
            writer.write(calculate(i, input));
        }            
        writer.flush();
        writer.close();
        reader.close();
    }
    private static String calculate(int i, String input) {
        String[] parts = input.split(" ");
        int sum = Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]);
        
        return "Case #" + (i+1) + ": "+parts[0] + " + " + parts[1] + " = " + sum + "\n";
    }
}
