package PraktikumPBO;

public class Segitiga1 {
    private int a,t;

    public Segitiga1(int a, int t) {
        this.a = a;
        this.t = t;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setT(int t) {
        this.t = t;
    }

    public int getA() {
        return a;
    }

    public int getT() {
        return t;
    }
    public double LuasSegitiga(){
        return 0.5*(getA()*getT());
    }
    public double KelilingSegitiga(){
        return 3*getA();
    }
}
