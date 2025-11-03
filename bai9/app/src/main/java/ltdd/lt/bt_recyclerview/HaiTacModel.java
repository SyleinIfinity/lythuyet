package ltdd.lt.bt_recyclerview;

public class HaiTacModel {
    private String maHaiTac;
    private String tenHaiTac;
    private String tienTruyNa; // Giữ dạng String để dễ format số lớn và thêm dấu "-"
    private int anhNhanDien; // Resource ID của ảnh (từ res/drawable)
    private boolean isAlive; // true là "ALIVE", false là "DEAD OR ALIVE"

    public HaiTacModel(String maHaiTac, String tenHaiTac, String tienTruyNa, int anhNhanDien, boolean isAlive) {
        this.maHaiTac = maHaiTac;
        this.tenHaiTac = tenHaiTac;
        this.tienTruyNa = tienTruyNa;
        this.anhNhanDien = anhNhanDien;
        this.isAlive = isAlive;
    }

    public String getMaHaiTac() {
        return maHaiTac;
    }

    public String getTenHaiTac() {
        return tenHaiTac;
    }

    public String getTienTruyNa() {
        return tienTruyNa;
    }

    public int getAnhNhanDien() {
        return anhNhanDien;
    }

    public boolean isAlive() {
        return isAlive;
    }
    public void setMaHaiTac(String maHaiTac) {
        this.maHaiTac = maHaiTac;
    }
    public void setTenHaiTac(String tenHaiTac) {
        this.tenHaiTac = tenHaiTac;
    }
    public void setTienTruyNa(String tienTruyNa) {
        this.tienTruyNa = tienTruyNa;
    }
    public void setAnhNhanDien(int anhNhanDien) {
        this.anhNhanDien = anhNhanDien;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}