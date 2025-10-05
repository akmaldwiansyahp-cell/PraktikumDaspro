package jobsheet5;

import java.util.Scanner;

public class ifCetakKRS20{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Apakah memiliki kartu mahasiswa? (true/false): ");
        boolean isKartu = scanner.nextBoolean();
        System.out.print("Apakah sudah melakukan registrasi online? (true/false): ");
        boolean isRegistrasi = scanner.nextBoolean();

        if(isKartu){
            System.out.println("Boleh masuk");
        }else if(isRegistrasi){
            System.out.println("Boleh masuk");
        }else{
            System.out.println("Tidak boleh masuk");
        }
    }
}