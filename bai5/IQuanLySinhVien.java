import java.util.*;

public interface IQuanLySinhVien {
    void themSinhVien(SinhVien sv);
    void themSinhVienTuBanPhim();
    double tinhDiemTrungBinh();
    HashMap<String, SinhVien> layDanhSachSapXepTheoTen();
    List<SinhVien> timSinhVienDiemCaoNhat();
    void hienThiTatCa();
}
