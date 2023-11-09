package Pertemuan5;

public class Gitar extends AlatMusik{
    private String TipeSenar;

    public Gitar(String nama, String caramain, String tipeSenar) {
        super(nama, caramain);
        TipeSenar = tipeSenar;
    }

    @Override
    public void TampilkanInfo() {
        super.TampilkanInfo();
        System.out.println("Tipe Senar = " +TipeSenar);
    }
}
