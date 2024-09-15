package A_0915;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_0046 {
    public static void main(String[] args) throws IOException{
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            char ch = reader.readLine().charAt(0);

            int ascii = (int) ch;
            System.out.println(ascii);
        }
    }
}
