package Pertemuan6;

public class Laundry {
    //atribut : jenis cuci, metode

    private String JenisCuci, metode;
    private int hrg;

    //constructor

    public Laundry(String jenisCuci, String metode, int hrg) {
        JenisCuci = jenisCuci;
        this.metode = metode;
        this.hrg = hrg;
    }
    //getter

    public String getJenisCuci() {
        return JenisCuci;
    }

    public String getMetode() {
        return metode;
    }

    public int getHrg() {
        return hrg;
    }

    //method tambahan
    public int cuciExpress(){
        return 5000;
    }
}
