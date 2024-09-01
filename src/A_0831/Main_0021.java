package A_0831;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_0021 {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String input = reader.readLine();
            int number = Integer.parseInt(input);
            
            for(int i = 1; i <10; i++) {
                System.out.println(number + " * " + i + " = " + number*i);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Invalid input format");
        }
    }
}
