package A_0916;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_0055 {
    public static void main(String[] args) throws IOException{
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String[] input = reader.readLine().split(" ");
            int[] chess = {1,1,2,2,2,8};
            for(int i = 0; i < chess.length; i++) {
                chess[i] -= Integer.parseInt(input[i]);
                writer.write(chess[i]+" ");
            }
            writer.flush();
        }
    }
}
