package A_0915;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main_0040 {
    public static void main(String[] args) throws IOException{
        int defaultValue = 42;
        int defaultCount = 10;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashSet<Integer> remainders = new HashSet<>();

        for( int i = 0; i < defaultCount; i++) {
            int currentValue = Integer.parseInt(reader.readLine());
            currentValue %= defaultValue;
            remainders.add(currentValue);
        }

        System.out.println(remainders.size());
        reader.close();
    }
}
