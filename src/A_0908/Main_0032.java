package A_0908;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_0032 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        while ((input = reader.readLine()) != null) {
            String[] strArr = input.split(" ");

            int sum = 0;
            for(int i = 0; i < strArr.length; i++) {
                sum += Integer.parseInt(strArr[i]);
            }
            writer.write(String.valueOf(sum));
            writer.newLine();
        }
        writer.flush();
    }
}
