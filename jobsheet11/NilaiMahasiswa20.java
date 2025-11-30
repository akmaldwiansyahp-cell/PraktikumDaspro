package jobsheet11;

import java.util.Scanner;

public class NilaiMahasiswa20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlhMhsw = sc.nextInt();
        int[] nilai = isianArray(jmlhMhsw);
        tampilArray(nilai);
        System.out.println("Total nilai dari semua mahasiswa adalah: " + hitTot(nilai));
    }
    static int[] isianArray(int jmlh){
        Scanner sc = new Scanner(System.in);
        int[] nilai = new int[jmlh];
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Input nilai mahasiswa ke-" + (i+1) + ": ");
            nilai[i] = sc.nextInt();
        }
        return nilai;
    }
    static void tampilArray(int[] tampilan){
        System.out.print("{ ");
        for (int i = 0; i < tampilan.length; i++) {
            System.out.print(tampilan[i] + " ");
        }
        System.out.print("}\n");
    }
    static int hitTot(int[] total){
        int totalAkhir = 0;
        for (int i = 0; i < total.length; i++) {
            totalAkhir += total[i];
        }
        return totalAkhir;
    }
}
