package A_0909;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_0033 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int totalNumberOfInputs  = Integer.parseInt(reader.readLine());

        String[] numbers = reader.readLine().split(" ");
        
        String targetNumber = reader.readLine();
        int matchCount = 0;

        for(int i = 0; i < totalNumberOfInputs; i++) {
            if(targetNumber.equals(numbers[i])){
                matchCount += 1;
            }
        }
        System.out.println(matchCount);
    }
}
