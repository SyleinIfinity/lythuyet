// package bai7;
import java.util.*;
public class QuanLySinhVien {
    private HashMap<String, SinhVien> danhSach = new HashMap<>();

    // Khoi tao 20 sinh vien mac dinh
    public void khoiTaoMacDinh() {
        String[] tenMau = {
            "An", "Binh", "Chi", "Dung", "Em",
            "Giang", "Hieu", "Khanh", "Linh", "Minh",
            "Ngoc", "Phong", "Quang", "Quynh", "Son",
            "Thao", "Tuan", "Van", "Yen", "Hai"
        };
        double[] diemMau = {
            7.5, 8.2, 6.9, 5.5, 9.0,
            7.0, 8.5, 9.1, 6.7, 7.8,
            8.0, 6.5, 7.2, 8.8, 5.9,
            7.3, 6.0, 8.1, 7.6, 9.1
        };
        for (int i = 0; i < 20; i++) {
            String ma = String.format("SV%03d", i+1);
            SinhVien sv = new SinhVien(ma, tenMau[i], diemMau[i]);
            danhSach.put(ma, sv);
        }
    }

    public void themSinhVien(SinhVien sv) {
        danhSach.put(sv.getMaSV(), sv);
    }

    public List<SinhVien> layDanhSachSapXepTheoTen() {
        List<SinhVien> ds = new ArrayList<>(danhSach.values());
        ds.sort(Comparator.comparing(SinhVien::getTen, String.CASE_INSENSITIVE_ORDER));
        return ds;
    }

    public List<SinhVien> timSinhVienDiemCaoNhat() {
        List<SinhVien> ketQua = new ArrayList<>();
        double max = Double.NEGATIVE_INFINITY;
        for (SinhVien sv : danhSach.values()) {
            if (sv.getDiemDauVao() > max) {
                max = sv.getDiemDauVao();
                ketQua.clear();
                ketQua.add(sv);
            } else if (sv.getDiemDauVao() == max) {
                ketQua.add(sv);
            }
        }
        return ketQua;
    }

    public double tinhDiemTrungBinh() {
        if (danhSach.isEmpty()) return 0;
        double tong = 0;
        for (SinhVien sv : danhSach.values()) tong += sv.getDiemDauVao();
        return tong / danhSach.size();
    }

    public void themSinhVienTuBanPhim() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien can them: ");
        int n;
        try {
            n = Integer.parseInt(sc.nextLine().trim());
        } catch (Exception e) {
            System.out.println("Gia tri khong hop le. Huy.");
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("Sinh vien moi #%d%n", i+1);
            System.out.print("Ma SV: ");
            String ma = sc.nextLine().trim();
            System.out.print("Ten: ");
            String ten = sc.nextLine().trim();
            System.out.print("Diem dau vao: ");
            double diem;
            try {
                diem = Double.parseDouble(sc.nextLine().trim());
            } catch (Exception e) {
                System.out.println("Diem khong hop le, bo qua sinh vien nay.");
                continue;
            }
            themSinhVien(new SinhVien(ma, ten, diem));
        }
    }

    public void hienThiDanhSach(List<SinhVien> ds) {
        for (SinhVien sv : ds) System.out.println(sv);
    }

    public void hienThiTatCa() {
        hienThiDanhSach(new ArrayList<>(danhSach.values()));
    }
}