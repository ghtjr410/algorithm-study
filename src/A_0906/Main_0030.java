package A_0906;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_0030 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(reader.readLine());

        for(int i = 1; i <= count; i++) {

            for(int j = count; j >0; j--)
            {
                if(j <= i){
                    writer.write("*");

                } else {
                    writer.write(" ");
                }
            }
            writer.newLine();
        }
        writer.flush();
    }
}