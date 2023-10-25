package Pertemuan4;
import java.io.*;
public class MainSuperClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        subClass s = new subClass("","",0);
        System.out.println("----INPUT----");
        System.out.println("Masukkan nama : ");
        String nama = br.readLine();
        System.out.println("Masukkan keterangan : ");
        String keterangan = br.readLine();
        System.out.println("Masukkan usia : ");
        int usia = Integer.parseInt(br.readLine());



        //Masukkan data ke object constructor
        s = new subClass(nama,keterangan,usia);
        System.out.println("Data Output");
        System.out.println("Nama = " +s.getNama());
        System.out.println("Keterangan = "+s.getKeterangan());
        System.out.println("Usia = "+s.getUsia());


    }

}
