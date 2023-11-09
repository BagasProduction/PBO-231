package Pertemuan5;


abstract class MusikAlat {
    private String nama;

    public MusikAlat(String nama) {
        this.nama = nama;
    }

    // Metode abstrak untuk memainkan alat musik
    public abstract void mainkan();

    // Metode umum
    public void tampilkanInfo() {
        System.out.println("Alat musik: " + nama);
    }
}