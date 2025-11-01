import java.util.*;

public class QuanLySinhVien implements IQuanLySinhVien {
    HashMap<String, SinhVien> danhSachSV;
    
    public QuanLySinhVien() {
        danhSachSV = new HashMap<>();
    }

    @Override
    public void themSinhVien(SinhVien sv) {
        danhSachSV.put(sv.getMaSV(), sv);
        
    }
    
    @Override
    public void themSinhVienTuBanPhim() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        String maSV = sc.nextLine();
        System.out.print("Nhap ten sinh vien: ");
        String tenSV = sc.nextLine();
        System.out.print("Nhap diem dau vao: ");
        double diemDauVao = sc.nextDouble();
        SinhVien sv = new SinhVien(maSV, tenSV, diemDauVao);
        themSinhVien(sv);
    }
    
    @Override
    public HashMap<String, SinhVien> layDanhSachSapXepTheoTen() {
        List<SinhVien> ds = new ArrayList<>(danhSachSV.values());
        Collections.sort(ds, (sv1, sv2) -> 
            sv1.getTenSV().compareToIgnoreCase(sv2.getTenSV())
            );
        LinkedHashMap<String, SinhVien> dsDaSapXep = new LinkedHashMap<>();
        for (SinhVien sv : ds) {
            dsDaSapXep.put(sv.getMaSV(), sv);
        }

        danhSachSV = dsDaSapXep;

        return danhSachSV;
    }
    
    
    @Override
    public List<SinhVien> timSinhVienDiemCaoNhat() {
        List<SinhVien> ketQua = new ArrayList<>();
        double max = Double.NEGATIVE_INFINITY;
        // double Diem = -1;
        for (SinhVien sv : danhSachSV.values()) {
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

    @Override
    public double tinhDiemTrungBinh() {
        double tong = 0;
        for (SinhVien sv : danhSachSV.values()) {
            tong += sv.getDiemDauVao();
        }
        if (danhSachSV.size() > 0) {
            return tong / danhSachSV.size();
        }
        return 0;
    }
    
    @Override
    public void hienThiTatCa() {
        
        for (SinhVien sv : danhSachSV.values()) {
            System.out.println(sv.toString());
        }
    }

}
