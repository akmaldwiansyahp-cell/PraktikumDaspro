import java.util.Scanner;

public class BioskopWithScanner20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, next;
        int baris, kolom;

        String[][] penonton = new String[4][2];
        while(true){

            System.out.print("Pilih 1.Input, 2.Tampilkan, 3.Exit: ");
            next =sc.nextLine();

            if(next.equals("1")){
                while(true){
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if(baris > 4 || kolom > 2){
                        System.out.println("Input baris atau kolom tidak benar, tolong coba kembali!");
                        continue;
                    }

                    if(penonton[baris-1][kolom-1] == null || penonton[baris-1][kolom-1].equals("***")){
                        penonton[baris-1][kolom-1] = nama;
                        break;
                    }else{
                        System.out.println("\nMohon maaf, kursi yang di input telah di isi sebelumnya\n");
                    }
                }
            }else if(next.equals("2")){
                System.out.println("\t Kolom 1 \t Kolom 2");
                for(int i = 0; i < penonton.length; i++){
                    for(int j = 0; j < penonton[i].length; j++){
                        if(penonton[i][j] == null){
                            penonton[i][j] = "***";
                        }
                    }
                    System.out.println("Baris " + (i+1) + "\t " + String.join("\t\t ", penonton[i]));   
                }
            }else if(next.equals("3")){
                break;
            }
        }
    }
}
