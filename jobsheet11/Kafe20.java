package jobsheet11;

import java.util.Scanner;


public class Kafe20 {
    public static void menu(){
        System.out.println("=== Menu Resto Kafe ===");
        System.out.println("1. Kopi hitam - Rp. 15,000");
        System.out.println("2. Cappuccino - Rp. 20,000");
        System.out.println("3. Latte - Rp. 22,000");
        System.out.println("4. Teh tarik - Rp. 12,000");
        System.out.println("5. Roti bakar - Rp. 10,000");
        System.out.println("6. Mie goreng - Rp. 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang anda inginkan");
    }

    public static int hitungTotalHarga(int pemilihanMenu, int banyakItem){
        int[] hargaItem = {15000, 20000, 22000, 12000, 10000, 18000};
        
        int hargaTotal = hargaItem[pemilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menu();
        System.out.print("\nMasukkan nomor menu yang ingin di pesan: ");
        int piilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin di pesan: ");
        int banyakItem = sc.nextInt();

        int totalHarga = hitungTotalHarga(piilihanMenu, banyakItem);
        System.out.println("Total harga untuk pesanan anda: Rp. " + totalHarga);
    }
}
