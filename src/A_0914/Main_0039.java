package A_0914;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main_0039 {
    public static void main(String[] args) throws IOException{
        int studentCount = 30;

        HashSet<Integer> presentStudents = new HashSet<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < studentCount-2; i++) {
            int studentNumber = Integer.parseInt(reader.readLine());
            presentStudents.add(studentNumber);
        }

        for(int i = 1; i <= studentCount; i++) {
            if(!presentStudents.contains(i)) {
                System.out.println(i);
            }
        }

    }
}
