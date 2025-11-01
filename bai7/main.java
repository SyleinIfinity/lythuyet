// package bai7;
public class main {
    public static void main(String[] args) {
        QuanLySinhVien qlsv = new QuanLySinhVien();
        qlsv.khoiTaoMacDinh();

        System.out.println("Danh sach (khong sap xep):");
        qlsv.hienThiTatCa();

        System.out.println("\nDanh sach sap xep theo ten A->Z:");
        qlsv.hienThiDanhSach(qlsv.layDanhSachSapXepTheoTen());

        System.out.println("\nSinh vien co diem dau vao cao nhat:");
        for (SinhVien sv : qlsv.timSinhVienDiemCaoNhat()) {
            System.out.println(sv);
        }

        System.out.printf("%nDiem dau vao trung binh: %.2f%n", qlsv.tinhDiemTrungBinh());

        // Them sinh vien moi tu ban phim
        qlsv.themSinhVienTuBanPhim();

        System.out.println("\nDanh sach sau khi them:");
        qlsv.hienThiDanhSach(qlsv.layDanhSachSapXepTheoTen());
    }
}
