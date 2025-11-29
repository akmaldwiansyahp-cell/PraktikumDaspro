package jobsheet11;

public class Kafe20 {
    public static void menu(String namaPelanggan, boolean isMember){
        System.out.println("Selamat datang " + namaPelanggan + "!");

        if(isMember){
            System.out.println("Anda adalah member, dapatkan 10% diskon pada setiap pembelian!");
        }

        System.out.println("=== Menu Resto Kafe ===");
        System.out.println("1. Kopi hitam - Rp. 15,000");
        System.out.println("1. Kopi hitam - Rp. 15,000");
        System.out.println("1. Kopi hitam - Rp. 15,000");
        System.out.println("1. Kopi hitam - Rp. 15,000");
        System.out.println("1. Kopi hitam - Rp. 15,000");
        System.out.println("1. Kopi hitam - Rp. 15,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang anda inginkan");
    }

    public static void main(String[] args) {
        menu("Andi", true);
    }
}
