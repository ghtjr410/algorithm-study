package A_0916;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main_0054 {
    public static void main(String[] args) throws IOException{
        try(BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            writer.write("         ,r'\"7\n");
            writer.write("r`-_   ,'  ,/\n");
            writer.write(" \\. \". L_r'\n");
            writer.write("   `~\\/\n");
            writer.write("      |\n");
            writer.write("      |\n");
            writer.flush();
        }
    }
}
