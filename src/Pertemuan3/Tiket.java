package Pertemuan3;
import java.util.Scanner;

class Tiket {
    private String username;
    private String password;
    private double hargaTiketPesawat;
    private int jumlahPenumpang;
    private double hargaKamarHotel;
    private int jumlahKamar;

    public Tiket(String username, String password) {
        this.username = "Bagas123";
        this.password = "123456";
    }

    public boolean login(String enteredUsername, String enteredPassword) {
        return this.username.equals(enteredUsername) &&
        this.password.equals(enteredPassword);
    }

    public void inputDataTransaksi() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan harga tiket pesawat: ");
        this.hargaTiketPesawat = input.nextDouble();

        System.out.print("Masukkan jumlah penumpang: ");
        this.jumlahPenumpang = input.nextInt();

        System.out.print("Masukkan harga kamar hotel: ");
        this.hargaKamarHotel = input.nextDouble();

        System.out.print("Masukkan jumlah kamar hotel: ");
        this.jumlahKamar = input.nextInt();
    }

    public void lihatDataTiket() {
        double hargaTiket = hargaTiketPesawat * jumlahPenumpang;
        double asuransi = jumlahPenumpang * 29000;
        double totalTiket = hargaTiket + asuransi;

        double diskon = 0.45 * hargaKamarHotel;
        double totalBiayaHotel = (hargaKamarHotel - diskon) * jumlahKamar;

        System.out.println("Total Harga Tiket Pesawat: " + totalTiket);
        System.out.println("Total Biaya Kamar Hotel: " + totalBiayaHotel);
    }
}
