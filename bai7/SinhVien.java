// package bai7;
public class SinhVien {
    private String maSV;
    private String ten;
    private double diemDauVao;

    public SinhVien(String maSV, String ten, double diemDauVao) {
        this.maSV = maSV;
        this.ten = ten;
        this.diemDauVao = diemDauVao;
    }

    public String getMaSV() { return maSV; }
    public String getTen() { return ten; }
    public double getDiemDauVao() { return diemDauVao; }

    public void setMaSV(String maSV) { this.maSV = maSV; }
    public void setTen(String ten) { this.ten = ten; }
    public void setDiemDauVao(double diemDauVao) { this.diemDauVao = diemDauVao; }

    @Override
    public String toString() {
        return String.format("%s - %s - %.2f", maSV, ten, diemDauVao);
    }
}