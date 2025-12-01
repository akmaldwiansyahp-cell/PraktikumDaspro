package jobsheet11;

import java.util.Scanner;

public class RecapPenjualanCafe20 {
    Scanner sc = new Scanner(System.in);
    int jmlhMenu = sc.nextInt();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input banyak menu yang ada di cafe: ");
        int jmlhMenu = sc.nextInt();
        System.out.print("Input jumlah hari yang di inginkan: ");
        int jmlhHari = sc.nextInt();

        int[][] jmlhPenjualan = new int[jmlhMenu][jmlhHari];
        String[] namaMenu = new String[jmlhMenu];
        namaMenu = inputMenu(namaMenu);
        jmlhPenjualan = inputJumlah(jmlhPenjualan, namaMenu);
        outputPenjualan(jmlhPenjualan, namaMenu);
        tertinggi(jmlhPenjualan, namaMenu);
        rataRata(jmlhPenjualan, namaMenu);
    }

    static String[] inputMenu(String[] namaMenu){
        Scanner sc = new Scanner(System.in);
        String[] menu = new String[namaMenu.length];
        for (int i = 0; i < menu.length; i++) {
            System.out.print("Nama menu ke-" + (i+1) + ": ");
            menu[i] = sc.nextLine();
        }
        return menu;
    }

    static int[][] inputJumlah(int[][] jumlah, String[] namaMenu){
        Scanner sc = new Scanner(System.in);
        int[][] inputanMenu = new int[jumlah.length][jumlah[0].length];
        for (int i = 0; i < jumlah.length; i++) {
            System.out.println("Menu ke-" + (i+1) + ": " + namaMenu[i]);
            for (int j = 0; j < jumlah[i].length; j++) {
                System.out.print("Hari ke-" + (j+1) + ": ");
                inputanMenu[i][j] = sc.nextInt();
            }
        }
        return inputanMenu;
    }

    static void outputPenjualan(int[][] outputMenu, String[] namaMenu){
        System.out.println("\n==============================================");
        String[][] output = new String[outputMenu.length][outputMenu[0].length];
        for (int i = 0; i < output.length; i++) {
            for (int j = 0; j < output[i].length; j++) {
                output[i][j] = String.valueOf(outputMenu[i][j]);
            }
        }
        System.out.printf("%-16s", "Menu");
        for (int h = 0; h < output[0].length; h++) {
            System.out.printf("%10s", "Hari " + (h+1));
        }
        System.out.println();
        for (int i = 0; i < outputMenu.length; i++) {
            System.out.printf("%-16s", namaMenu[i]);
            for (int j = 0; j < outputMenu[i].length; j++) {
                System.out.printf("%10d", outputMenu[i][j]);
            }
            System.out.println();
        }
        System.out.println("==============================================");
    }

    static void tertinggi(int[][] tinggi, String[] namaMenu){
        int[] totalTinggi = new int[tinggi.length];
        int max = -1;
        int maxint = 0;
        for (int i = 0; i < tinggi.length; i++) {
            for (int j = 0; j < tinggi[i].length; j++) {
                totalTinggi[i] += tinggi[i][j];
            }
            if(maxint < totalTinggi[i]){
                    max += 1;
                    maxint = totalTinggi[i];
            }
        }
        System.out.println("\n=====================================");
        System.out.println("Menu terlaris adalah " + namaMenu[max] + " dengan total penjualan sebanyak " + totalTinggi[max]);
    }

    static void rataRata(int[][] rata, String[] namaMenu){
        System.out.println("\n==========================");
        System.out.println("=== Rata-rata setiap menu ===");
        for (int i = 0; i < rata.length; i++) {
            double total = 0;
            for (int j = 0; j < rata[i].length; j++) {
                total += rata[i][j];
            }
            total /= rata[i].length;
            System.out.println(namaMenu[i] + ": " + total + " per hari");
        }
    }
}
