package Kelas;
import java.util.Scanner;

public class Prosedur {
    public static void Garis() {
        System.out.println("========================");
    }
    public static int STotal(int a, int b){
        int hasil = a*b;
        return (hasil);
    }
    public static void main(String [] args){
        int harga = 0;
        int qty = 0;
        int subtotal = 0;
        Scanner input = new Scanner(System.in);
        Garis();
        System.out.println("Pilihan Menu");
        Garis();
        System.out.println("1. Nasi Pecel");
        System.out.println("2. Nasi Rawon");
        System.out.println("3. Nasi Soto");
        System.out.println("Masukkan nomor menu");
        int nomor = Integer.parseInt(input.nextLine());
        switch(nomor){
            case 1:
                System.out.print("Masukkan harga porsi pecel= ");
                harga = input.nextInt();
                input.nextLine();
                System.out.print("Masukkan jumlah porsi= ");
                qty = input.nextInt();
                input.nextLine();
                System.out.println("Harga porsi pecel= " +harga);
                System.out.println("Quantitas porsi pecel = " +qty);
                System.out.println("Subtotal pecel = " +STotal(harga,qty));
                break;
            case 2:
                System.out.print("Masukkan harga porsi rawon= ");
                harga = input.nextInt();
                input.nextLine();
                System.out.print("Masukkan jumlah porsi rawon= ");
                qty = input.nextInt();
                input.nextLine();
                System.out.println("Harga porsi rawon= " +harga);
                System.out.println("Quantitas porsi rawon = " +qty);
                System.out.println("Subtotal rawon = " +STotal(harga,qty));
                break;
            case 3:
                System.out.print("Masukkan harga porsi soto= ");
                harga = input.nextInt();
                input.nextLine();
                System.out.print("Masukkan jumlah porsi soto= ");
                qty = input.nextInt();
                input.nextLine();
                System.out.println("Harga porsi soto= " +harga);
                System.out.println("Quantitas porsi soto = " +qty);
                System.out.println("Subtotal soto = " +STotal(harga,qty));
                break;
        }


    }
}
