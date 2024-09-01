package A_0901;
    // n이 주어졌을때 1부터 n까지 합을 구하는 프로그램을 작성하시오
    // 첫째 줄에 n(1<= n <= 10000)이 주어진다
    // 1부터 n까지 합을 출력한다

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_0023 {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String numberStr = reader.readLine();
            int number = Integer.parseInt(numberStr);
            int sum = 0;
            for(int i = 1; i < number+1; i++){
                sum += i;
            }
            System.out.println(sum);
            
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e){
            System.out.println("Invalid input Integer");
        }                
    }
}
