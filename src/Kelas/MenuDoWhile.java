package Kelas;
import java.util.*;
public class MenuDoWhile {
    public static void main(String[] args){
        int porsi = 0;
        int harga = 0;
        int total = 0;
        do {
        Scanner inputan = new Scanner(System.in);
        System.out.println("Menu pilihan :");
        System.out.println("1. Soto Ayam");
        System.out.println("2. Bakso Sapi");
        System.out.println("3. Nasi Goreng");
        System.out.println("4. Selesai");
        System.out.print("Masukkan nomor menu pilihan anda =");
        int nomor = Integer.parseInt(inputan.nextLine());
        switch(nomor) {
            case 1:
                System.out.println("Anda pesan Soto Ayam");
                System.out.println("Ingin beli berapa porsi");
                porsi = Integer.parseInt(inputan.nextLine());
                harga = 15000;
                total = porsi * harga;
                System.out.println("Harga per porsi = " + harga);
                System.out.println("Total bayar = " + total);
                break;
            case 2:
                System.out.println("Anda pesan Bakso Sapi");
                System.out.println("Ingin beli berapa porsi");
                porsi = Integer.parseInt(inputan.nextLine());
                harga = 10000;
                total = porsi * harga;
                System.out.println("Harga per porsi = " + harga);
                System.out.println("Total bayar = " + total);
                break;
            case 3:
                System.out.println("Anda pesan Nasi Goreng");
                System.out.println("Ingin beli berapa porsi");
                porsi = Integer.parseInt(inputan.nextLine());
                harga = 12000;
                total = porsi * harga;
                System.out.println("Harga per porsi = " + harga);
                System.out.println("Total bayar = " + total);
            break;
            default:
                System.out.println("Nomor pilihan anda tidak terdaftar");
                System.exit(0);
        }
        }while(true);
    }
}
