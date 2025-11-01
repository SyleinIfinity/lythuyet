import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] maSV = {
            "SV001", "SV002", "SV003", "SV004", "SV005",
            "SV006", "SV007", "SV008", "SV009", "SV010",
            "SV011", "SV012", "SV013", "SV014", "SV015",
            "SV016", "SV017", "SV018", "SV019", "SV020"
        };
        String[] tenSV = {
            "Nguyen Van B", "Tran Thi A", "Le Van C", "Pham Thi D", "Hoang Van E",
            "Vu Thi F", "Dang Van G", "Bui Thi H", "Do Van I", "Phan Thi J",
            "Trinh Van K", "Dinh Thi L", "Cao Van A", "Luu Thi N", "Ngo Van O",
            "Mai Thi P", "Truong Van Q", "Ly Thi R", "Chu Van S", "Quach Thi T"
        };
        double[] diemDauVao = {
            7.5, 8.0, 6.5, 9.0, 5.5,
            8.5, 7.0, 6.0, 9.5, 7.8,
            8.2, 6.8, 7.3, 8.7, 5.9,
            9.1, 6.4, 7.6, 8.3, 7.9
        };

        QuanLySinhVien qlsv = new QuanLySinhVien();
        for (int i = 0; i < maSV.length; i++) {
            SinhVien sv = new SinhVien(maSV[i], tenSV[i], diemDauVao[i]);
            qlsv.themSinhVien(sv);
        }

        int i = -1;
        do {
            System.out.println("================================");
            System.out.println("0. Thoat chuong trinh");
            System.out.println("1. Danh sach sinh vien hien tai: ");
            System.out.println("2. Sap xep theo thu tu A - Z: ");
            System.out.println("3. Sinh vien co diem dau vao cao nhat: ");
            System.out.println("4. Diem dau vao trung binh: ");
            System.out.println("5. Them sinh vien moi tu ban phim: ");
            System.out.println("================================");
            System.out.printf("Hay nhap vao lua chon:  ");
            i = sc.nextInt();

            switch (i) {
                case 1:
                    qlsv.hienThiTatCa();
                    break;
                case 2:
                    qlsv.layDanhSachSapXepTheoTen();
                    break;
                case 3:
                    qlsv.timSinhVienDiemCaoNhat();
                    System.out.println("Sinh vien co diem dau vao cao nhat: ");
                    for (SinhVien sv : qlsv.timSinhVienDiemCaoNhat()) {
                        System.out.println(sv);
                    }
                    break;
                case 4:
                    qlsv.tinhDiemTrungBinh();
                    System.out.printf("Diem dau vao trung binh: %.2f%n", qlsv.tinhDiemTrungBinh());
                    break;
                case 5:
                    qlsv.themSinhVienTuBanPhim();
                    break;
                default:
                    break;
            }
        } while (i!=0);

    }
    
}
