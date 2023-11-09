package Pertemuan6;
import java.io.*;

public class MainLaundry {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String jenis, nama, kode, metode, tglCuci, tglAmbil;
        int harga, berat;
        //instance of class
        Laundry L = new Laundry("","",0);
        transaksiLaundry tl = new transaksiLaundry
        ("","",0,"","",
         "","",0);


        do {
            System.out.println("--Laundry Production--");
            System.out.println("1. Menu Master");
            System.out.println("2. Menu Tranksasi");
            System.out.println("3. Menu Cari Data");
            System.out.println("4. Menu Keluar");
            int menu = Integer.parseInt(br.readLine());
            switch (menu){
                case 1:
                    System.out.println("1. Menu Master");
                    //input --> class laundry
                    System.out.println("Entri jenis cucian: ");
                    jenis = br.readLine();
                    System.out.println("Entri harga: ");
                    harga = Integer.parseInt(br.readLine());
                    System.out.println("Entri metode: ");
                    metode = br.readLine();
                    L = new Laundry(jenis, metode, harga);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("2. Menu Transaksi");
                    System.out.println("Entri kode: ");
                    kode = br.readLine();
                    System.out.println("Entri nama: ");
                    nama = br.readLine();
                    System.out.println("Entri jenis cuci \n Cuci Setrika/Cuci Kering: ");
                    jenis = br.readLine();
                    System.out.println("Entri metode (Regular/Express): ");
                    metode = br.readLine();
                    System.out.println("Entri berat: ");
                    berat = Integer.parseInt(br.readLine());
                    System.out.println("Entri tanggal cuci: ");
                    tglCuci = br.readLine();
                    System.out.println("Entri tanggal ambil: ");
                    tglAmbil = br.readLine();
                    tl = new transaksiLaundry(jenis, metode, L.getHrg(), kode, nama, tglCuci, tglAmbil, berat);
                    System.out.println();
                    System.out.println("-- Cetak Data --");
                    tl.transaksi();
                    break;
                case 3 :
                    System.out.println("-- 3. Menu Cari Data");
                    System.out.println("Entri kode transaksi yang dicari : ");
                    kode = br.readLine();
                    break;
                default :
                    System.exit(0);

            }
        }while(true);

    }
}
