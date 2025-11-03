import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0, kuadrat;
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.print("n -> " + i + " = ");
            for(int j = 1; j <= i; j++){
                kuadrat = j * j;
                total += kuadrat;

                System.out.print(kuadrat);

                if(j < i){
                    System.out.print(" + ");
                }
            }

            if(i > 1){
                System.out.println(" = " + total);
            }else{
                System.out.println();
            }
        }
    }
}
