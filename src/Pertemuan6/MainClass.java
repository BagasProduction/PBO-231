package Pertemuan6;
import java.io.*;

public class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //instance of class polymorphism: menyesuaikan
        //instance of class inheritance : sub class
        Persegi p = new Persegi();
        subpersegi sp = new subpersegi();
        p.cetakLuas();
        sp.cetakLuas();

    }

}
