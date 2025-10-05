package jobsheet5;

import java.util.Scanner;

public class nestedUjianSkripsi20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Apakah mahasiswa bebas kompen (iya/tidak): ");
        String bebasKompen = scanner.next().trim();

        System.out.print("Masukkan jumlah log bimbingan Pembimbing 1: ");
        int bimbinganP1 = scanner.nextInt();
        System.out.print("Masukkan jumlah log bimbingan Pembimbng 2: ");
        int bimbinganP2 = scanner.nextInt();

        String pesan;
        if(bebasKompen.equalsIgnoreCase("ya")){
            if(bimbinganP1 >= 8 && bimbinganP2 >= 4){
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            }else if(bimbinganP1 < 8 && bimbinganP2 < 4){
                pesan = "Gagal! Log bimbingan P1 belum mencapai 8 kali dan P2 belum mencapai 4 kali";
            }else if (bimbinganP1 < 8){
                pesan = "Gagal! Log bimbingan P1 belum mencapai 8 kali";
            }else{
                pesan = "Galal! Log bimbingan P2 belum mencapai 4 kali";
            }
        }else{
            pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
        }

        System.out.println(pesan);                              
    }
}
