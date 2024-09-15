package A_0916;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_0060 {
    public static void main(String[] args) throws IOException{
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int count = Integer.parseInt(reader.readLine());

            int check = 0;
            for(int i = 0; i < count; i++) {
                String word = reader.readLine();
                boolean isContinuous = true;

                for(int j = 1; j< word.length(); j++){
                    if (word.charAt(j) != word.charAt(j - 1) && word.indexOf(word.charAt(j)) < j - 1) {
                        isContinuous = false;
                        break;
                    }
                }

                if (isContinuous) {
                    check++; 
                }
            }
            System.out.println(check);
        }
    }
}
