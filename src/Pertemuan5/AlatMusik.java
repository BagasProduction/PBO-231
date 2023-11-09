package Pertemuan5;

public class AlatMusik {
    private String nama;
    private String caramain;

    public AlatMusik(String nama, String caramain){
        this.nama = nama;
        this.caramain = caramain;
    }
    public void TampilkanInfo(){
        System.out.println("Nama alat musik = " +nama);
        System.out.println("Cara main alat musik = " +caramain);
    }

}
