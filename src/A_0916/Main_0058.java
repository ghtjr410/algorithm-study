package A_0916;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main_0058 {
    public static void main(String[] args) throws IOException{
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String word = reader.readLine().toUpperCase();
            HashMap<Character, Integer> charCountMap = new HashMap<>();

            for(char c : word.toCharArray()) {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0)+1);
            }

            int maxCount = 0;
            char maxChar = '?';
            for(char c : charCountMap.keySet()) {
                if(charCountMap.get(c) > maxCount) {
                    maxCount = charCountMap.get(c);
                    maxChar = c;
                } else if (charCountMap.get(c) == maxCount) {
                    maxChar = '?';
                }
            }
            System.out.println(maxChar);
        }
    }
}
