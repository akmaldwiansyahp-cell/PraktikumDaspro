import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalPelanggan = 0, totalItem = 0, jmlhPelanggan, item;

        System.out.print("Jumlah cabang cafe: ");
        int jmlhCabang = sc.nextInt();
        System.out.println("\n=== Input Penjualan Per Cabang ===");
        for(int i = 1; i <= jmlhCabang; i++){
            System.out.println("\n--- Cabang " + i + " ---");
            System.out.print("Jumlah pelanggan: ");
            jmlhPelanggan = sc.nextInt();
            item = 0;
            for(int j = 1; j <= jmlhPelanggan; j++){
                System.out.print("Pelanggan " + j + " memesan berapa item? ");
                item += sc.nextInt();
            }
            System.out.println("Cabang " + i + ":");
            System.out.println("- Pelanggan: " + jmlhPelanggan);
            System.out.println("- Item terjual: " + item);
            totalPelanggan += jmlhPelanggan;
            totalItem += item;
        }
        System.out.println("\nTotal seluruh Cabang:");
        System.out.println("Pelanggan: " + totalPelanggan);
        System.out.println("Item terjual: " + totalItem);
    }
}
