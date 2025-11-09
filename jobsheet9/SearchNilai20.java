package jobsheet9;

import java.util.Scanner;

public class SearchNilai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input banyaknya nilai yang akan dimasukkan: ");
        int banyakNilai = sc.nextInt();
        int[] arrNilai = new int[banyakNilai];
        int key;
        int hasil = 0;

        for(int i = 0; i < arrNilai.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            arrNilai[i] = sc.nextInt();
        }
        
        System.out.print("Masukkan nilai yang ingin dicari: ");
        key = sc.nextInt();
        for(int i = 0; i < arrNilai.length; i++){
            if(key == arrNilai[i]){
                hasil = i + 1;
                break;
            }
        }

        if(hasil != 0){
            System.out.println();
            System.out.println("Nilai " + key + " ditemukan di indeks ke-" + hasil);
            System.out.println();
        }else{
            System.out.println();
            System.out.println("Nilai yang dicari tidak ditemukan");
            System.out.println();
        }
    }
}
