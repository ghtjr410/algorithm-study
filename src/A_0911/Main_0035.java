package A_0911;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_0035 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int totalNumberOfInputs = Integer.parseInt(reader.readLine());
        String[] numbers = reader.readLine().split(" ");

        int[] intNumbers = Arrays.stream(numbers)
                .limit(totalNumberOfInputs)
                .mapToInt(Integer::parseInt)
                .toArray();

        int min = Arrays.stream(intNumbers).min().getAsInt();
        int max = Arrays.stream(intNumbers).max().getAsInt();

        System.out.println(min + " " + max);
    }
}
