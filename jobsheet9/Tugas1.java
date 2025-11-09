package jobsheet9;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tertinggi = 0, terendah = 100, jumlah = 0, rata2;

        System.err.println("=== Nilai Mahasiswa ===");

        System.out.print("Berapa banyak mahasiswa yang ingin di input? ");
        int jmlhSiswa = sc.nextInt();
        double[] nilai = new double[jmlhSiswa];
        for(int i = 0; i < nilai.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilai[i] = sc.nextDouble();
            if(nilai[i] > tertinggi){
                tertinggi = nilai[i];
            }
            if(nilai[i] < terendah){
                terendah = nilai[i];
            }
            jumlah += nilai[i];
        }

        rata2 = jumlah / nilai.length;

        System.out.println("\n === Hasil Semua Nilai Mahasiswa ===");

        System.out.println("Nilai tertinggi adalah: " + tertinggi);
        System.out.println("Nilai terendah adalah: " + terendah);
        System.out.println("Rata-rata total adalah: " + rata2);
        System.out.print("Semua nilai adalah: {");
        for(int i = 0; i < nilai.length; i++){
            System.out.print(nilai[i]);
            if(i < (nilai.length - 1)){
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
