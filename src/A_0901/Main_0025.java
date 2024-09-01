package A_0901;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_0025 {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String numberStr = reader.readLine();
            int number = Integer.parseInt(numberStr);
            int count = number/4;

            String res = "";

            for(int i = 0; i< count; i++){
                res += "long ";
            }
            res += "int";

            System.out.println(res);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Invalid input Integer");
        }
    }
}
