package A_0915;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_0049 {
    public static void main(String[] args) throws IOException{
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int count = Integer.parseInt(reader.readLine());
            
            for(int i = 0; i < count; i++) {
                String[] input = reader.readLine().split(" ");
                int repeat = Integer.parseInt(input[0]);
                String word = input[1];
                StringBuilder sb =new StringBuilder();

                for(int j = 0; j < word.length(); j++) {
                    char ch = word.charAt(j);
                    for(int k = 0; k < repeat; k++) {
                        sb.append(ch);
                    }
                }
                writer.write(sb.toString());
                writer.newLine();
            }
            writer.flush();
        }
    }
}
