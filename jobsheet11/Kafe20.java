package jobsheet11;

public class Kafe20 {
    public static void menu(String namaPelanggan, boolean isMember, String kodePromo){
        System.out.println("Selamat datang " + namaPelanggan + "!");

        if(isMember){
            if(kodePromo.equalsIgnoreCase("DISKON50")){
                System.out.println("Anda adalah member, dapatkan 50% diskon pada setiap pembelian!");
            }else if (kodePromo.equalsIgnoreCase("DISKON30")) {
                System.out.println("Anda adalah member, dapatkan 30% diskon pada setiap pembelian!");
            }else{
                System.out.println("Mohon maaf kode yang anda input tidak valid!");
            }
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
        menu("Budi", true, "diskon30");
    }
}
