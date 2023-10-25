package Pertemuan4;


//class turunan dari class person = sub class/anak kelas
public class Customer extends Person{
    private String id;

    //constructor
    public Customer(String nama, String alamat, String id_cust) {
        super(nama, alamat);
        id = id_cust;
    }
    //overriding method
    @Override
    public String getNama() {
        return super.getNama();
    }
    @Override
    public String getAlamat() {
        return super.getAlamat();
    }

    public String getId() {
        return id;
    }
}
