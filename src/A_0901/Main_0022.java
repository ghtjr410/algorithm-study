package A_0901;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_0022 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String countStr = reader.readLine();
            int count = Integer.parseInt(countStr);

            int[] arr = new int[count];

            for(int i = 0; i < count; i++) {
                String[] numbers = reader.readLine().split(" ");
                int num1 = Integer.parseInt(numbers[0]);
                int num2 = Integer.parseInt(numbers[1]);
                arr[i] = num1 + num2;
            }

            for(int i = 0; i< count; i++) {
                System.out.println(arr[i]);
            }

        } catch (IOException e) {            
            e.printStackTrace();
        } catch (NumberFormatException e){
            System.out.println("Invalid input format");
        }
    }
}
