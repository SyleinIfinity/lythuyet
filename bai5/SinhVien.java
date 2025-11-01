public class SinhVien {
    private String maSV;
    private String tenSV;
    private double diemDauVao;

    public SinhVien(String maSV, String tenSV, double diemDauVao) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.diemDauVao = diemDauVao;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public double getDiemDauVao() {
        return diemDauVao;
    }

    public void setDiemDauVao(double diemDauVao) {
        this.diemDauVao = diemDauVao;
    }

    @Override
    public String toString() {
        return String.format("%5s | %20s | %20.2f", maSV, tenSV, diemDauVao);
    }
}
