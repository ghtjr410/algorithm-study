package A_0915;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_0043 {
    public static void main(String[] args) throws IOException{

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String word = reader.readLine();
            int index = Integer.parseInt(reader.readLine());
    
            System.out.println(word.charAt(index-1));
        }
    }
}
