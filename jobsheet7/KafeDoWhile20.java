import java.util.Scanner;

public class KafeDoWhile20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalharga, kopi, teh, roti, hargaRoti = 20000, hargaKopi = 12000, hargaTeh = 7000;
        String namaPelanggan;

        do{
            System.out.print("Sebutkan nama pelanggan (Ketik 'batal untuk keluar'): ");
            namaPelanggan = sc.nextLine();
            if(namaPelanggan.equalsIgnoreCase("batal")){
                System.out.println("Transaksi dibatalkan");
                break;
            }

            System.out.print("Jumlah Kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah Teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah Roti: ");
            roti = sc.nextInt();

            totalharga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp. " + totalharga);
            sc.nextLine();
        }while(true);

        System.out.println("Semua transaksi selesai.");

    }
}
