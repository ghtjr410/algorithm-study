package A_0915;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_0051 {
    public static void main(String[] args) throws IOException{
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String input = reader.readLine();

            String[] reverseStr = new StringBuilder(input).reverse().toString().split(" ");
            
            int num1 = Integer.parseInt(reverseStr[0]);
            int num2 = Integer.parseInt(reverseStr[1]);

            System.out.println(Math.max(num1, num2));
        }
    }
}
