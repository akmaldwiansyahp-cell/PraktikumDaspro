package jobsheet11;

public class PengunjungCafe20 {
    static void daftarPengunjung(String ...namaPengunjung){
        System.out.println("Daftar nama pengunjung:");
        for (String a : namaPengunjung) {
            System.out.println("- " + a);
        }
    }

    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }

    
}
