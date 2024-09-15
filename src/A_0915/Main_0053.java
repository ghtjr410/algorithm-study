package A_0915;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_0053 {
    public static void main(String[] args) throws IOException{
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String str;
            while ((str = reader.readLine()) != null) {
                writer.write(str);
                writer.newLine();
            }
            writer.flush();
        }
    }
}
