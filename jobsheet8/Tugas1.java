import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0, kuadrat;
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            kuadrat = i * i;
            total += kuadrat;
            System.out.println("n -> " + i + " = " + kuadrat + " = "+ total);
        }
    }
}
