package jobsheet9;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isAda = false;
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        System.out.print("Menu yang ingin dicari? ");
        String pencarian = sc.nextLine();

        for(int i = 0; i < menu.length; i++){
            if(pencarian.equalsIgnoreCase(menu[i])){
                isAda = true;
            }
        }

        if(isAda){
            System.out.println("Barang yang anda cari tersedia");
        }else{
            System.out.println("Barang yang anda cari tidak tersedia");
        }
    }
    
}
