package jobsheet9;

import java.util.Scanner;

public class ArrayRataNilai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlhMhs = sc.nextInt();

        int[] nilaiMhs = new int[jmlhMhs];
        int kelulusan = 0;
        double totalLulus = 0, rata2Lulus = 0, rata2TdkLulus = 0, totalTdkLulus = 0;

        for(int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            if(nilaiMhs[i] > 70){
                kelulusan++;
                totalLulus += nilaiMhs[i];
                rata2Lulus = totalLulus / Math.round((totalLulus/nilaiMhs[i]));
            }else if (nilaiMhs[i] <= 70){
                totalTdkLulus += nilaiMhs[i];
                rata2TdkLulus = totalTdkLulus / Math.round((totalTdkLulus/nilaiMhs[i]));
            }
        }
        System.out.println("Mahasiswa yang lulus sebanyak = " + kelulusan);
        System.out.println("Rata-rata nilai yang lulus = " + rata2Lulus);
        System.out.println("Rata-rata nilai yang tidak lulus = " + rata2TdkLulus);
    }
}
