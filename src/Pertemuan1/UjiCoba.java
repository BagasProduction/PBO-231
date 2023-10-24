package Pertemuan1;

public class UjiCoba {

    //atribut = variabel
    //private/protected
    private String name;
    private double ipk;



    //operasi/fungsi


    //constractor
    //getter
    public String getName(){
        return this.name;
    }
    public double getIpk(){
        return this.ipk;
    }
    //setter = prosedur
    public void setName(String name){
        //jika nama atribut pada class = nama atribut pada parameter setter/getter
        this.name =  name;

    }
    public void setIpk(double ipk){
        this.ipk = ipk;
    }

    //custom method --> fungsi2 lain

}
