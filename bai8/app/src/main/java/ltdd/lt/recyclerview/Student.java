package ltdd.lt.recyclerview;

public class Student {
    private String maSV;
    private String Ho;
    private String ten;
    private String lop;
    private int anhDaiDien;

    public Student(String maSV, String ho, String ten, String lop, int anhDaiDien)
    {
        this.maSV = maSV;
        this.Ho = ho;
        this.ten = ten;
        this.lop = lop;
        this.anhDaiDien = anhDaiDien;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }
    public String getHo() {
        return Ho;
    }
    public void setHo(String ho) {
        Ho = ho;
    }
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public String getLop() {
        return lop;
    }
    public void setLop(String lop) {
        this.lop = lop;
    }

    public int getAnhDaiDien() {
        return anhDaiDien;
    }
    public void setAnhDaiDien(int anhDaiDien) {
        this.anhDaiDien = anhDaiDien;
    }
}
