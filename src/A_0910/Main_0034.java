package A_0910;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_0034 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputParams = reader.readLine().split(" ");

        String[] numberList = reader.readLine().split(" ");

        int numberOfElements = Integer.parseInt(inputParams[0]);
        int comparisonValue = Integer.parseInt(inputParams[1]);

        for(int i = 0; i < numberOfElements; i ++) {
            if(Integer.parseInt(numberList[i]) < comparisonValue){
                writer.write(numberList[i] + " ");
            }
        }

        writer.flush();
        writer.close();
        reader.close();
    }
}
