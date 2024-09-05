package A_0905;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_0029 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int count = Integer.parseInt(reader.readLine());

        for (int i = 0; i < count; i++) {
            String temp = "";
            for(int j = 0; j < i+1; j++) {
                temp += "*";
            }
            writer.write(temp +"\n");
        }
        writer.flush();

        writer.close();
        reader.close();
    }
}