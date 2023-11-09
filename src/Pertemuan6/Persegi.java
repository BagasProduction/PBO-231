package Pertemuan6;

public class Persegi {
    //luas persegi: sisi x sisi

    private int sisi;

    //overloading method --> syarat: jumlah parameter berbeda
    public int getSisi() {
        return sisi;
    }

    public int getLuas() { //nilai sisi default
        return 4 * 4;
    }

    //inputan user dengan parameter
    public int getLuas(int s) {
        int luas = s * s;
        return luas;
    }
    //overriding -> ada sub class karena sifatnya pewarisan
    public void cetakLuas(){
        System.out.println("Luas persegi adalah " +getLuas());
    }
}

