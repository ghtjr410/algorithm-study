package A_0916;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_0057 {
    public static void main(String[] args) throws IOException{
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String word = reader.readLine();

            String reverseWord = new StringBuilder(word).reverse().toString();

            if(word.equals(reverseWord)){
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
