package Pertemuan2;
import java.util.*;

public class contoh2 {
    //membuat program untuk menghitung nilai akhir dari MK PBO per mahasiswa
    //NA = (UTS + 20%) + (UAS + 25%) + (TUGAS + 55%)
    /* Contoh outputnya:
    NIM     : 0123
    NAMA    : Jodi
    PRODI   : SI
    MK      : PBO
    NA      = 88
     */

    //atribut
    private String nim,nama,prodi,mk;
    private double uts,uas,tugas,na;

    //operasi

    //setter
    public void setNim(String nim){
        this.nim = nim;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setProdi(String prodi){
        this.prodi = prodi;
    }
    public void setMk(String mk){
        this.mk = mk;
    }
    public void setUts(double uts){
        this.uts = uts;
    }
    public void setUas(double uas) {
        this.uas = uas;
    }
    public void setTugas(double tugas) {
        this.tugas = tugas;
    }
    public void setNa(double na) {
        this.na = na;
    }

    //getter
    public String getNim(){
        return this.nim;
    }
    public String getNama(){
        return this.nama;
    }
    public String getProdi(){
        return this.prodi;
    }
    public String getMk(){
        return this.mk;
    }
    public double getUts(){
        return this.uts;
    }
    public double getUas(){
        return this.uas;
    }
    public double getTugas(){
        return this.tugas;
    }
    public double getNa(){
        return this.na;
    }
    public double getNA(){
        na = (getUts()*0.2)*(getUas()*0.25)*(getTugas()*0.55);
        return na;
    }
    //cetak data
    public void CetakData(){
        System.out.println("NIM : " +getNim() + "\n" + "NA : " +getNa());
    }



}
