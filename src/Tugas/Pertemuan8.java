package Tugas;
import java.util.Scanner;
public class Pertemuan8 {
    public static void garis(){
        System.out.println("=========================================");
    }
    public static void opening(){
        System.out.println("Selamat datang di toko Barokah Madura");
        System.out.println("Toko ini buka 12 jam setiap hari");
        System.out.println("Toko ini menjual segala kebutuhan pokok");
        System.out.println("Toko ini memiliki beberapa cabang di sekitar Jawa Timur");
        System.out.println("Dalam hari tertentu, toko kami mengadakan diskon bagi pembeli");
        System.out.println("Selamat berbelanja");
    }
    public static int parkir(String a,double b){
        int Parkir =0;
        if (a.equalsIgnoreCase("Motor")){
            Parkir = 3000;
            if (b > 8 ){
                Parkir = 30000;
            }else;
        }else if (a.equalsIgnoreCase("Mobil")){
            Parkir = 7000;
            if (b > 8 ){
                Parkir = 50000;
            }else;
        }
    return(Parkir);
    }
    public static void belanja(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah barang yang akan dibeli = ");
        int N = input.nextInt();
        input.nextLine();
        String data01[][] = new String[N][3];
        int data02[][] = new int[N][3];
        int total = 0;
        for (int x=0; x<N; x++){
            System.out.print("Masukkan kode barang ke-["+x+"][0] = ");
            data01[x][0] = input.nextLine();
            System.out.print("Masukkan nama barang ke-["+x+"][1] = ");
            data01[x][1] = input.nextLine();
            System.out.print("Masukkan jumlah barang ke-["+x+"][2] = ");
            data02[x][0] = input.nextInt();
            input.nextLine();
            System.out.print("Masukkan harga barang ke-["+x+"][3] = ");
            data02[x][1] = input.nextInt();
            input.nextLine();
            System.out.print("Masukkan tanggal beli barang ke-["+x+"][3] = ");
            data01[x][2] = input.nextLine();
            data02[x][2] =  data02[x][0]*data02[x][1];
             total = total + data02[x][2];
        }
        for (int x=0; x<N; x++){
            System.out.println("kode barang ke-["+x+"][0] = "+data01[x][0]);
            System.out.println("nama barang ke-["+x+"][1] = "+data01[x][1]);
            System.out.println("jumlah barang ke-["+x+"][2] = "+data02[x][0]);
            System.out.println("harga barang ke-["+x+"][4] = "+data02[x][1]);
            System.out.println("subtotal barang ke-["+x+"][5] = "+data02[x][2]);
            System.out.println("tanggal beli barang ke-["+x+"][6] = "+data01[x][2]);
        }
        System.out.println("Total keseluruhan = "+total);
    }


    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        garis();
        opening();
        garis();
        System.out.print("Kendaraan yang digunakan (Motor/Mobil) = ");
        String kendaraan = input.nextLine();
        System.out.print("Lama anda memarkirkan kendaraan (JAM) = ");
        double lama = input.nextDouble();
        garis();
        System.out.println("Biaya Parkir yang harus dibayar = " +parkir(kendaraan,lama));
        garis();
        belanja();

    }
}
