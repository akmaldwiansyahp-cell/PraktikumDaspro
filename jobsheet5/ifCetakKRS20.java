package jobsheet5;

import java.util.Scanner;

public class ifCetakKRS20{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("---Cetak KRS---");
        System.out.print("Apakah UKT sudah lunas (true/false): ");
        boolean uktLunas = scanner.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran terverivikasi");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        }else{
            System.out.println("Regristrasi ditolak");
            System.out.println("Silahkan lunasi UKT terlebih dahulu");
        }
    }
}