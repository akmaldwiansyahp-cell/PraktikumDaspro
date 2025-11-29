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

    public static int hitungTotalHarga20(int pemilihanMenu, int banyakItem, String diskon){
        int[] hargaItem = {15000, 20000, 22000, 12000, 10000, 18000};
        double jmlhDiskon = 1;
        if(diskon.equalsIgnoreCase("DISKON50")){
            jmlhDiskon = 0.5;
        }else if(diskon.equalsIgnoreCase("DISKON30")){
            jmlhDiskon = 0.3;
        }

        double hargaTotal = hargaItem[pemilihanMenu - 1] * banyakItem * jmlhDiskon;
        return (int)hargaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menu();
        System.out.print("Berapa banyak jenis menu yang ingin di pesan: ");
        int jmlhJenis = sc.nextInt();
        int banyakItem = 0;
        int piilihanMenu = 0;
        int totalHarga = 0;
        String kodeDiskon = "";

        for(int i = 0; i < jmlhJenis; i++){
        System.out.print("\nMasukkan nomor menu yang ingin di pesan: ");
        piilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin di pesan: ");
        banyakItem = sc.nextInt();
        System.out.print("Masukkan kode diskon (jika punya): ");
        kodeDiskon = sc.next();
        totalHarga += hitungTotalHarga20(piilihanMenu, banyakItem, kodeDiskon);
        }
        
        System.out.println("Total harga untuk pesanan anda: Rp. " + totalHarga);
    }
}
