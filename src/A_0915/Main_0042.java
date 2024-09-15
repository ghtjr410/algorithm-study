package A_0915;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_0042 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int subjectCount = Integer.parseInt(reader.readLine());
        String[] scoreInputs = reader.readLine().split(" ");

        int[] scores = new int[subjectCount];
        int maxScore = 0;
        double sum = 0.0;

        for(int i = 0; i < subjectCount; i++) {
            scores[i] = Integer.parseInt(scoreInputs[i]);
            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }
        }
        
        for(int i = 0; i < subjectCount; i++) {
            double adjustedScore = (double) scores[i] / maxScore * 100;
            sum += adjustedScore;
        }

        double avg = sum / subjectCount;
        System.out.println(avg);
    }
}
