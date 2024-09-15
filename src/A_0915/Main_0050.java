package A_0915;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_0050 {
    public static void main(String[] args) throws IOException{
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String input = reader.readLine().trim();
            if (input.isEmpty()) {
                System.out.println(0);
            } else {
                System.out.println(input.split("\\s+").length);
            }
        }
    }
}
