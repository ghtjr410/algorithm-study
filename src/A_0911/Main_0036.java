package A_0911;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_0036 {
    public static void main(String[] args) throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int max = 1;
        int position = 0;
        
        for(int i = 0; i < 9; i++) {
            int currentNumber = Integer.parseInt(reader.readLine());
            if(currentNumber > max) {
                max = currentNumber;
                position = i+1;
            }
        }
        reader.close();
        System.out.println(max + "\n" + position);
    }
}
