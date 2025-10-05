package jobsheet5;

import java.util.Scanner;

public class ifCetakKRS20{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Apakah Dosen? (true/false): ");
        boolean isDosen = scanner.nextBoolean();
        
        if(isDosen){
            System.out.println("Akses WiFi diberikan (dosen)");
        }else{
            System.out.print("Apakah Mahasiswa? (true/false): ");
            boolean isMahasiswa = scanner.nextBoolean();

            if(isMahasiswa){
                System.out.print("Jumlah dari sks: ");
                int sks = scanner.nextInt();
                if (sks >= 12) {
                    System.out.println("Akses WiFi diberikan (mahasiswa aktif)");
                }else{
                    System.out.println("Akses ditolak, SKS kurang dari 12");
                }
            }else{
                System.out.println("Akses ditolak");
            }
        }

    }
}