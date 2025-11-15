import java.util.Arrays;
import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] survey = new int[10][6];
        String[] Pertanyaan = {
            "Pertanyaan 1: ", "Pertanyaan 2: ",
            "Pertanyaan 3: ", "Pertanyaan 4: ",
            "Pertanyaan 5: ", "Pertanyaan 6: "
        };

        double rataSeluruh = 0;

        for(int i = 0; i < survey.length; i++){
            System.out.println("Responden ke-" + (i+1));
            double rataRespon = 0;
            for(int j = 0; j < survey[i].length; j++){
                System.out.print(Pertanyaan[j]);
                survey[i][j] = sc.nextInt();
                rataRespon += survey[i][j];
                rataSeluruh += survey[i][j];
            }
            System.out.println("Rata-rata Responden ke-" + (i+1) + ": " + rataRespon/6);
        }

        System.out.println("\n=====================");
        System.out.println("Rata-rata pertanyaan survey:");

        for(int i = 0; i < 6; i++){
            double rataSurvey = 0;
            for(int j = 0; j < 10; j++){
                rataSurvey += survey[j][i];
            }
            System.out.println("Rata-rata survey ke-" + (i+1) + ": " + rataSurvey/10);
        }

        System.out.println("Rata-rata keseluruhan survey adalah: " + rataSeluruh/60);
    }
}
