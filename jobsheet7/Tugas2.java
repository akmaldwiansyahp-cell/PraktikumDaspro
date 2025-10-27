import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total = 0;
        do{
            System.out.print("Masukkan jenis kendaraan (1 = mobil, 2 = motor, 0 = keluar): ");
            jenis = sc.nextInt();
            if(jenis == 1 || jenis == 2){
                System.out.print("Masukkan durasi parkir (dalam jam): ");
                durasi = sc.nextInt();
                if(durasi > 5){
                    total += 12500;
                }else if(jenis == 1){
                    total += durasi * 3000;
                }else if(jenis == 2){
                    total += durasi * 2000;
                }
            }else if(jenis == 0){
                System.out.println("Program dimatikan");
                break;
            }else{
                System.out.println("Input kendaraan salah! Tolong input kembali");
                continue;
            }
        }while(jenis != 0);
        System.out.println("Total biaya parkir hari ini adalah Rp." + total);
    }
}
