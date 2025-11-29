package jobsheet11;

import java.util.Scanner;

public class Kubus20 {
    static void menghitungKubus(double sisi){
        double volume = sisi * sisi * sisi;
        double luasPermukaan = sisi * sisi;
        System.out.println("Volume kubus adalah " + volume);
        System.out.println("Luas permukaan kubus adalah " + luasPermukaan);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input panjang sisi kubus: ");
        double sisi = sc.nextInt();
        menghitungKubus(sisi);
    }
}
