import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == 1){
                    System.out.print(n);
                }else if(i == n){
                    System.out.print(n);
                }else if(1 < i && i < n){
                    if(j == 1 || j == n){
                        System.out.print(n);
                    }
                    if(n >= 10 && 1 < j && j<n){
                    System.out.print("  ");
                    }else if(1 < j && j < n){
                    System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }
}
