package Kelas;
import java.util.*;

public class DataMhsFOR {
    public static void main(String[] args){
        Scanner inputan = new Scanner(System.in);
        System.out.println("Masukkan jumlah mahasiswa");
        int jumlah = Integer.parseInt(inputan.nextLine());
        for (int i=1; i<= jumlah; i++) {
            System.out.print("Masukkan NIM Mhs ke-" +i+"=");
            String nim = inputan.nextLine();
            System.out.print("Masukkan nama Mhs ke-" +i+"=");
            String nama = inputan.nextLine();
            System.out.print("Masukkan angkatan Mhs ke-" +i+"=");
            int angk = Integer.parseInt(inputan.nextLine());
            System.out.println(" NIM Mhs ke-" +i+"="+nim);
            System.out.println(" nama Mhs ke-" +i+"="+nama);
            System.out.println(" angkatan Mhs ke-" +i+"="+angk);


        }
    }
}
