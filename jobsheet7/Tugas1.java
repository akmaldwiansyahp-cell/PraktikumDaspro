import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlTiket, hargaTiket = 50000, totalTiket = 0, i = 1;
        double totalBiaya = 0;
        while(true){
            System.out.println("Pelanggan ke-" + (i));
            System.out.print("Berapa banyak tiket yang dibeli (Ketik 0 untuk berhenti): ");
            jmlTiket = sc.nextInt();
            if(jmlTiket > 4){
                totalBiaya += jmlTiket * hargaTiket - (jmlTiket * hargaTiket * 0.1);
                totalTiket += jmlTiket;
            }else if(jmlTiket > 10){
                totalBiaya += jmlTiket * hargaTiket - (jmlTiket * hargaTiket * 0.15);
                totalTiket += jmlTiket;
            }else if(jmlTiket <= 4 && jmlTiket > 0){
                totalBiaya += hargaTiket;
                totalTiket += jmlTiket;
            }else if(jmlTiket < 0){
                System.out.println("Input tidak valid, coba ulangi kembali");
                continue;
            }
            if(jmlTiket == 0){
                System.out.println("Program diselesaikan.");
                break;
            }
            i++;
        }
        System.out.println("Total biaya untuk hari ini adalah " + totalBiaya);
        System.out.println(totalTiket);
    }
}
