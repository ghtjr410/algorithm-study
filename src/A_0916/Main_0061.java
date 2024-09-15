package A_0916;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_0061 {
    public static void main(String[] args) throws IOException{
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int count = Integer.parseInt(reader.readLine());

            for(int i = 0; i < count; i++) {
                char[] inputArr = reader.readLine().toCharArray();
                int totalScore  = 0;
                int consecutiveCount  = 1;

                for(char c : inputArr) {
                    if(c == 'O') {
                        totalScore += consecutiveCount ;
                        consecutiveCount  ++;
                    } else if (c == 'X') {
                        consecutiveCount  = 1;
                    }
                }
                writer.write(totalScore +"");
                writer.newLine();
            }
            writer.flush();
        }
    }
}
