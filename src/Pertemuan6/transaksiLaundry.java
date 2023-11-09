package Pertemuan6;

public class transaksiLaundry extends Laundry{
    private String kode, namaPelanggan,tglCuci, tglAmbil;
    private int berat;

    public transaksiLaundry(String jenisCuci, String metode, int hrg, String kode, String namaPelanggan, String tglCuci, String tglAmbil, int berat) {
        super(jenisCuci, metode, hrg);
        this.kode = kode;
        this.namaPelanggan = namaPelanggan;
        this.tglCuci = tglCuci;
        this.tglAmbil = tglAmbil;
        this.berat = berat;
    }

    public String getKode() {
        return kode;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public String getTglCuci() {
        return tglCuci;
    }

    public String getTglAmbil() {
        return tglAmbil;
    }

    public int getBerat() {
        return berat;
    }
    public int getTotal(){
        return getBerat()*getHrg();
    }

    public void transaksi(){
        System.out.println("Nama pelanggan : " +getNamaPelanggan());
        System.out.println("Jenis Cuci : " +getJenisCuci());
        System.out.println("Metode (Reguler/Express : "+getMetode());
        System.out.println("Harga Jasa : "+getHrg());
        System.out.println("Tanggal cuci : "+getTglCuci());
        System.out.println("Tanggal ambil : "+getTglAmbil());
        System.out.println("BERAT cucian : "+getBerat());
        System.out.println("Sub Total : "+getTotal());//sub total (harga*berat)
        System.out.println("Total : "+cuciExpress()); //+ jasa express
    }
    //searching data --> tau dulu kode transaksi
    public void transaksi(String kode){
        System.out.println("Nama pelanggan : " +getNamaPelanggan());
        System.out.println("Jenis Cuci : " +getJenisCuci());
        System.out.println("Metode (Reguler/Express : "+getMetode());
        System.out.println("Harga Jasa : "+getHrg());
        System.out.println("Tanggal cuci : "+getTglCuci());
        System.out.println("Tanggal ambil : "+getTglAmbil());
        System.out.println("BERAT cucian : "+getBerat());
        System.out.println("Sub Total : "+getTotal());//sub total (harga*berat)
        System.out.println("Total : "+cuciExpress()); //+ jasa express

    }
    @Override
    public int cuciExpress() {
        //menjumlahnkan sub total dengan biaya express
        //misal : sub total = 16000 + 5000, shg total = 21000
        //boleh memanggil fungsi di dalam fungsi
        int total = getTotal();
        if(getMetode().equalsIgnoreCase("express")){
            total += super.cuciExpress();
            //16000 = 16000+5000
        }
        return total;

    }
}

