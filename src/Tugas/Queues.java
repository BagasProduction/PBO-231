package Tugas;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class Queues {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Queue<String> antrian = new LinkedList<>();
        System.out.println("Sistem Queue pada antrian kasir pada Betamart");
        int kapasitas = 7;
        System.out.println("Kapasitas maksimum antrian pada kasir hanyalah sebanyak 7 orang");
        for (int i = 1; i <= 7; i++) {
            System.out.print("Masukkan nama pelanggan ke-" + i + " = ");
            String nama = input.nextLine();
            antrian.offer(nama);
        }

        System.out.println("Daftar antrian kasir pada Betamart:");
        for (String pelanggan : antrian) {
            System.out.println(pelanggan);
        }

        String pelangganTerdepan = antrian.peek();
        System.out.println("Elemen terdepan dalam antrian: " + pelangganTerdepan);


    }
}
