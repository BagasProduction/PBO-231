package PraktikumPBO;

public class PersegiPanjang {
    //atribut
    private int p,l;

    //constructor
    public PersegiPanjang(int p, int l) {
        this.p = p;
        this.l = l;
    }

    //setter dan getter

    public void setP(int p) {
        this.p = p;
    }
    public void setL(int l) {
        this.l = l;
    }
    public int getP() {
        return p;
    }
    public int getL() {
        return l;
    }
    //method tambahan
    public double LuasPersegiPanjang(){
        return getP()*getL();
    }
}
