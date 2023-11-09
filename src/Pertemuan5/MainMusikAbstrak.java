package Pertemuan5;

public class MainMusikAbstrak {
    public static void main(String[] args) {
        MusikAlat alat1 = new Guitar("Gitar Elektrik");
        MusikAlat alat2 = new Drum("Drum Akustik");

        alat1.tampilkanInfo();
        alat1.mainkan();

        alat2.tampilkanInfo();
        alat2.mainkan();
    }
}
