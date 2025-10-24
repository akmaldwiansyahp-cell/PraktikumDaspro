import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlTiket, hargaTiket = 50000;
        double totalBiaya;
        while(true){
            System.out.print("Berapa banyak tiket yang dibeli: ");
            jmlTiket = sc.nextInt();

            if(jmlTiket > 4){
                totalBiaya = jmlTiket * hargaTiket - (jmlTiket * hargaTiket * 0.1);
                System.out.println(totalBiaya);
            }else if(jmlTiket > 10){
                totalBiaya = jmlTiket * hargaTiket - (jmlTiket * hargaTiket * 0.15);
                System.out.println(totalBiaya);
            }else if(jmlTiket <= 0){
                System.out.println("Input tidak valid, coba ulangi kembali");
                continue;
            }
        }
        
    }
}
