package Pertemuan5;

import java.io.IOException;

public class MainAlatMusik {
    public static void main(String[] args) throws IOException {
        AlatMusik musik = new Gitar("Gitar","Dipetik","Nylon");
        AlatMusik musik2 = new Piano("Piano","Ditekan","Yamaha");
        musik.TampilkanInfo();
        musik2.TampilkanInfo();





    }
}
