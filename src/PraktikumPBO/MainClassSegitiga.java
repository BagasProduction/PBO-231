package PraktikumPBO;

import java.io.IOException;
import java.io.*;

public class MainClassSegitiga {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Kerucut k = new Kerucut(0,0,0);
        System.out.println("Masukkan Panjang alas segitiga = ");
        int a = Integer.parseInt(br.readLine());
        System.out.println("Masukkan tinggi segitiga = ");
        int t = Integer.parseInt(br.readLine());
        double r = k.getR();
        k = new Kerucut(a,t,r);
        System.out.println("Hasil Data");
        System.out.println("Luas Segitiga = " +k.LuasSegitiga());
        System.out.println("Keliling Segitiga = "+k.KelilingSegitiga());
        System.out.println("Volume Segitiga = "+k.VolumeKerucut());
    }
}
