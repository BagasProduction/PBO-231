package Pertemuan6_V2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CRUD {
    //class ini merupakan kumpulan2 menu program
    /* di class ini bisa:
    1. menambahkan import lib java IO di setiap method
    2. menambahkan tipe data array untuk penyimpanan array
    3. bufferredreader ditambahkan di masing2 method
     */
    // array: 1D[BARIS], 2D[BARIS][KOLOM]

    //deklarasi array berdasarkan class yg ada (Laundry dan transaksi)
    Laundry L[];
    transaksiLaundry tl[];

    String jenis, nama, kode, metode, tglCuci, tglAmbil;
    int harga, berat;


    public void insertMasterData() throws IOException{
        BufferedReader br = new BufferedReader
                (new InputStreamReader(System.in));
        //perlu 2 data utk input master
        //deklarasi ulang array
        L = new Laundry[2];
        //ketika menggunakan array, input dan output menggunakan looop ---> for
        for (int i = 0; i < L.length; i++){
            //copass dari mainClass menu 1
            System.out.println("1. Menu Master");
            //input --> class laundry
            System.out.println("Entri jenis cucian: ");
            jenis = br.readLine();
            System.out.println("Entri harga: ");
            harga = Integer.parseInt(br.readLine());
            System.out.println("Entri metode: ");
            metode = br.readLine();
            L[i] = new Laundry(jenis, metode, harga);
            System.out.println();
        }

    }
    public void insertTransaksi() throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        tl = new transaksiLaundry[2];
        for (int i = 0; i < tl.length; i++) {
            System.out.println("2. Menu Transaksi");
            System.out.println("Entri kode: ");
            kode = br.readLine();
            System.out.println("Entri nama: ");
            nama = br.readLine();
            System.out.println("Entri jenis cuci (Cuci Setrika/Cuci Kering): ");
            jenis = br.readLine();
            System.out.println("Entri metode (Regular/Express): ");
            metode = br.readLine();
            System.out.println("Entri berat: ");
            berat = Integer.parseInt(br.readLine());
            System.out.println("Entri tanggal cuci: ");
            tglCuci = br.readLine();
            System.out.println("Entri tanggal ambil: ");
            tglAmbil = br.readLine();
            tl[i] = new transaksiLaundry(jenis, metode, L[0].getHrg(), kode, nama, tglCuci, tglAmbil, berat);
            System.out.println();
        }
    }
    public void cetakData() throws  IOException{
        System.out.println("--Cetak Data--");
        for (int i = 0; i < tl.length; i++) {
            tl[i].transaksi();

        }
    }
    public void cariData() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("-- 3. Menu Cari Data");
        System.out.println("Entri kode transaksi yang dicari: ");
        String kodeCari = br.readLine();

        for (int i = 0; i < tl.length; i++) {
            if (tl[i].getKode().equals(kodeCari)) {
                System.out.println("-- Data Ditemukan --");
                tl[i].transaksi();
                return;
            }
        }
        System.out.println("Data tidak ditemukan untuk kode: " + kodeCari);
    }

}
