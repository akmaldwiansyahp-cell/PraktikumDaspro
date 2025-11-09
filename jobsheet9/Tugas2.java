package jobsheet9;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlhPesanan = sc.nextInt();
        sc.nextLine();
        String[] Menu = new String[jmlhPesanan];
        double[] Harga = new double[jmlhPesanan];
        int totalBiaya = 0;

        for(int i = 0; i < jmlhPesanan; i++){
            System.out.print("Masukkan menu ke-" + (i+1) + " : ");
            Menu[i] = sc.nextLine();
            System.out.print("Masukkan harga ke-" + (i + 1) + " : ");
            Harga[i] = sc.nextDouble();
            sc.nextLine();
            totalBiaya += Harga[i];
        }

        for(int i = 0; i < jmlhPesanan; i++){
            System.out.println("Menu ke-" + (i + 1) + " : " + Menu[i] + " dengan harga Rp. " + Harga[i]);

        }
        System.out.println("Total harga semua pesanan adalah: " + totalBiaya);
    }
}
