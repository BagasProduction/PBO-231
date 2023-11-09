package Pertemuan5;

public class Piano extends AlatMusik {
    private String merk;

    public Piano(String nama, String caramain, String merk) {
        super(nama, caramain);
        this.merk = merk;
    }

    @Override
    public void TampilkanInfo() {
        super.TampilkanInfo();
        System.out.println("Merk Piano = " +merk);
    }
}
