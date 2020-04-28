/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mualif Dwi Saputra
 */
public class Data {
    private String Nim;
    private String Nama;
    private String Kelas;

    public Data() {
        Nim = "";
        Nama = "";
        Kelas= "";
    }

    public Data(String Nim, String Nama, String Kelas) {
        this.Nim = Nim;
        this.Nama = Nama;
        this.Kelas = Kelas;
    }

    public void setNim(String noNim) {
        this.Nim = Nim;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setKelas(String Kelas) {
        this.Kelas = Kelas;
    }

    public String getNim() { return Nim; }

    public String getNama() { return Nama; }

    public String getKelas() { return Kelas; }

    

}

