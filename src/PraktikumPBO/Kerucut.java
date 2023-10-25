package PraktikumPBO;

public class Kerucut extends Segitiga1 {
    private double r;

    public Kerucut(int a, int t, double r) {
        super(a, t);
        this.r = r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return getA()/2;
    }

    @Override
    public void setA(int a) {
        super.setA(a);
    }

    @Override
    public void setT(int t) {
        super.setT(t);
    }

    @Override
    public int getA() {
        return super.getA();
    }

    @Override
    public int getT() {
        return super.getT();
    }

    public double VolumeKerucut(){
        return (1.0/3.0)*(3.14*getR()*getR()*getT());
    }
}
