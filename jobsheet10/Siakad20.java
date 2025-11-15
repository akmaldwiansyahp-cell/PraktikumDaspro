import java.util.Scanner;

public class Siakad20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa yang akan di input: ");
        int jmlhMhsw = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah setiap mahasiswa: ");
        int jmlhMatkul = sc.nextInt();

        int[][] nilai = new int[jmlhMhsw][jmlhMatkul];

        for(int i = 0; i < nilai.length; i++){
            System.out.println("Input nilai mahasiswa ke-" + (i+1));
            double totalPerSiswa = 0;

            for(int j = 0; j < nilai[i].length; j++){
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            System.out.println("Nilai rata-rata: " + totalPerSiswa/jmlhMatkul);
        }

        System.out.println("\n===========================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah");

        for(int j = 0; j < jmlhMatkul; j++){
            double totalPerMatkul = 0;
            for(int i = 0; i < jmlhMhsw; i++){
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata kuliah " + (j+1) + ": " + totalPerMatkul/jmlhMhsw);
        }
    }
}
