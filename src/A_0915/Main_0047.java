package A_0915;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_0047 {
    public static void main(String[] args) throws IOException{
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int count = Integer.parseInt(reader.readLine());
            String input = reader.readLine();

            int sum = 0;
            for(int i = 0; i < count; i ++){
                // '0'을 빼서 해당 문자 숫자를 int로 변환
                sum += input.charAt(i) - '0';
            }
            System.out.println(sum);
        }
    }
}
