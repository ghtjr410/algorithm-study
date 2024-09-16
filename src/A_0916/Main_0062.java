package A_0916;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main_0062 {
    public static void main(String[] args) throws IOException{
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
                
            String[] inputs = reader.readLine().trim().split("\\s+");
            BigInteger num1 = new BigInteger(inputs[0]);
            BigInteger num2 = new BigInteger(inputs[1]);
            BigInteger count = num1.divide(num2);
            BigInteger remain = num1.mod(num2);

            writer.write(count.toString() + "\n" + remain.toString());

            writer.flush();
        } 
    }
}
