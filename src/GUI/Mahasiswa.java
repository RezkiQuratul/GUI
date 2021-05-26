package GUI;

import javax.swing.*;
import java.io.StringReader;

public class Mahasiswa {
    private String Nama;
    private String Nim;
    private String JP;
    private String TM;
    private String Fakul;
    private String Jur;
    private String JK;
    private String NoUr;

    public Mahasiswa() {
    }

    public Mahasiswa(String Nama, String Nim, String JP, String TM, String Fakul, String Jur, String JK, String NoUr) {
        this.Nama = Nama;
        this.Nim = Nim;
        this.JP = JP;
        this.TM = TM;
        this.Fakul = Fakul;
        this.Jur = Jur;
        this.JK = JK;
        this.NoUr = NoUr;
    }

    public String getNama() {
        return Nama;
    }
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getNim() {
        return Nim;
    }
    public void setNim(String Nim) {
        this.Nim = Nim;
    }

    public String getJP() {
        return JP;
    }
    public void setJP(String JP) {
        this.JP = JP;
    }

    public String getTM() {
        return TM;
    }
    public void setTM(String TM) {
        this.TM = TM;
    }

    public String getFakul() {
        return Fakul;
    }
    public void setFakul(String Fakul) {
        this.Fakul = Fakul;
    }

    public String getJur() {
        return Jur;
    }
    public void setJur(String Jur) {
        this.Jur = Jur;
    }

    public String getJK() {
        return JK;
    }
    public void setJK(String JK) {
        this.JK = JK;
    }

    public String getNoUr() { return NoUr; }
    public void setNoUr(String NoUr) { this.NoUr = NoUr; }

    @Override
    public String toString() {
        final String Biodata = "Data Mahasiswa : " + "\n" + "\n" +
                "Nama\t\t= " + Nama + "\n" +
                "Nim\t\t= " + Nim + "\n" +
                "Jenjang Pendidikan\t= " + JP + "\n" +
                "Tahun Masuk\t\t= " + TM + "\n" +
                "Fakultas\t\t= " + Fakul + "\n" +
                "Jurusan\t\t= " + Jur + "\n" +
                "Jenis Kelamin\t\t= " + JK + "\n" +
                "Nomor Urut\t\t= " + NoUr;

        return Biodata;



    }


}
