package vangiau.example.ecobicyclerent.model;

import java.io.Serializable;

public class DanhSachSanPham implements Serializable {
    public String soluong;
    public String giathuexe;
    public String hinhanhthietbi;
    public String id;
    public String idthietbi;
    public String mota;
    public String tenthietbi;

    public DanhSachSanPham() {
    }

    public DanhSachSanPham(String soluong, String giathuexe, String hinhanhthietbi, String id, String idthietbi, String mota, String tenthietbi) {
        this.soluong = soluong;
        this.giathuexe = giathuexe;
        this.hinhanhthietbi = hinhanhthietbi;
        this.id = id;
        this.idthietbi = idthietbi;
        this.mota = mota;
        this.tenthietbi = tenthietbi;
    }

    public String getSoluong() {
        return soluong;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }

    public String getGiathuexe() {
        return giathuexe;
    }

    public void setGiathuexe(String giathuexe) {
        this.giathuexe = giathuexe;
    }

    public String getHinhanhthietbi() {
        return hinhanhthietbi;
    }

    public void setHinhanhthietbi(String hinhanhthietbi) {
        this.hinhanhthietbi = hinhanhthietbi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdthietbi() {
        return idthietbi;
    }

    public void setIdthietbi(String idthietbi) {
        this.idthietbi = idthietbi;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getTenthietbi() {
        return tenthietbi;
    }

    public void setTenthietbi(String tenthietbi) {
        this.tenthietbi = tenthietbi;
    }
}
