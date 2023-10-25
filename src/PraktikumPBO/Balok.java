package PraktikumPBO;

public class Balok extends PersegiPanjang {
    private int t;

    public Balok(int p, int l, int t) {
        super(p, l);
        this.t = t;
    }

    public Balok(int p, int l) {
        super(p, l);
    }

    @Override
    public void setP(int p) {
        super.setP(p);
    }

    @Override
    public void setL(int l) {
        super.setL(l);
    }

    @Override
    public int getP() {
        return super.getP();
    }

    @Override
    public int getL() {
        return super.getL();
    }


    public void setT(int t) {
        this.t = t;
    }

    public int getT() {
        return t;
    }

    public double LuasBalok(){
        return 2*((super.getP()*super.getL())+(super.getP()*getT())+(super.getL()*getT()));
    }
    public double VolumeBalok(){
        return super.getP()*super.getL()*getT();
    }
}
