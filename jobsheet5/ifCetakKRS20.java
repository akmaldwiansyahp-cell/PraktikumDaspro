package jobsheet5;

import java.util.Scanner;

public class ifCetakKRS20{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Angka yang diinginkan: ");
        int angka = scanner.nextInt();

        if(angka % 2 == 0){
            System.out.println("Angka tersebut adalah genap");
        }else{
            System.out.println("Angka tersebut adalah ganjil");
        }
    }
}