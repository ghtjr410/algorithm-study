package A_0916;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main_0059 {
    public static void main(String[] args) throws IOException{
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String word = reader.readLine();
            
            List<String> croatiaAlphabets = new ArrayList<>();
            croatiaAlphabets.add("c=");
            croatiaAlphabets.add("c-");
            croatiaAlphabets.add("dz=");
            croatiaAlphabets.add("d-");
            croatiaAlphabets.add("lj");
            croatiaAlphabets.add("nj");
            croatiaAlphabets.add("s=");
            croatiaAlphabets.add("z=");

            int count = 0;
            for(int i = 0; i < word.length(); i++) {
                boolean found = false;

                for(String croatia : croatiaAlphabets) {
                    if(i + croatia.length() <= word.length() && word.startsWith(croatia, i)) {
                        count ++;
                        i += croatia.length() - 1;
                        found = true;
                        break;
                    }
                }

                if(!found) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
