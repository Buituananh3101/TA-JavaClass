package BaiTapSlide.s030201_PhanSo_;

public class PhanSo {
    // 1. Định nghĩa các thuộc tính (Attributes)
    private int tu;
    private int mau;

    // 2. Xây dựng các hàm tạo (Constructors)
    
    // Hàm tạo mặc định (không tham số)
    public PhanSo() {
        this.tu = 0;
        this.mau = 1; // Mẫu số phải khác 0
    }

    // Hàm tạo có đối số
    public PhanSo(int tu, int mau) {
        this.tu = tu;
        if (mau == 0) {
            System.out.println("Mau != 0, defaut 1");
            this.mau = 1;
        } else {
            this.mau = mau;
        }
    }

    // 3. Xây dựng Getters, Setters
    public int gettu() { return tu;}

    public void settu(int tu) {this.tu = tu;}

    public int getmau() {return mau;}

    public void setmau(int mau) {
        if (mau == 0) System.out.println("Mẫu != 0.");
        else this.mau = mau;
    }

    // Hàm toString để in ra dạng tu/mau
    @Override
    public String toString() {return tu + "/" + mau;}

    // 4. Xây dựng hàm riêng (Methods)

    // GCD
    private int gcd(int a, int b) {
        a = Math.abs(a); 
        b = Math.abs(b);
        
        while (b != 0) {
            int temp = b;
            b = a % b;  
            a = temp;
        }
        return a;
    }

    // Hàm rút gọn phan so
    public PhanSo rutGon() {
        if (tu == 0) return new PhanSo(0,1); // Không cần rút gọn nếu tử bằng 0
        int uscln = gcd(tu, mau);
        return new PhanSo(tu/uscln, mau/uscln);
    }

    // Các hàm tính toán: Cộng, Trừ, Nhân, Chia
    // Logic: Trả về một đối tượng PhanSo MỚI là kết quả của phép tính
    
    public PhanSo cong(PhanSo ps) {
        int t = (this.tu * ps.mau) + (ps.tu * this.mau);
        int m = this.mau * ps.mau;
        PhanSo ketQua = new PhanSo(t, m);
        return ketQua.rutGon();
    }

    public PhanSo tru(PhanSo ps) {
        int t = (this.tu * ps.mau) - (ps.tu * this.mau);
        int m = this.mau * ps.mau;
        PhanSo ketQua = new PhanSo(t, m);
        return ketQua.rutGon();
    }

    public PhanSo nhan(PhanSo ps) {
        int t = this.tu * ps.tu;
        int m = this.mau * ps.mau;
        PhanSo ketQua = new PhanSo(t, m);
        return ketQua.rutGon();
    }

    public PhanSo chia(PhanSo ps) {
        int t = this.tu * ps.mau;
        int m = this.mau * ps.tu;
        PhanSo ketQua = new PhanSo(t, m);
        return ketQua.rutGon();
    }

    // Hàm so sánh 2 phan so
    public int soSanh(PhanSo ps) {
        long v1 = (long) this.tu * ps.mau;
        long v2 = (long) ps.tu * this.mau;

        if (v1 > v2) return 1;
        else if (v1 < v2) return -1;
        else return 0;
    }

    // 99. Hàm hỗ trợ khác
    public double parseDou() {
        return (double) tu / mau;
    }

    public boolean isInt() {
        return tu % mau == 0;
    }

    public static void main(String[] args) {
        // Tạo 2 phan so: 1/2 và 3/4
        PhanSo p1 = new PhanSo(1, 2);
        PhanSo p2 = new PhanSo(3, 4);

        System.out.println("phan so 1: " + p1); // Tự động gọi p1.toString()
        System.out.println("phan so 2: " + p2);

        // Test phép cộng
        PhanSo pTong = p1.cong(p2); System.out.println("Tong: " + pTong);

        // Test phép trừ
        PhanSo pHieu = p1.tru(p2); System.out.println("Hieu: " + pHieu);

        // Test phép nhân
        PhanSo pTich = p1.nhan(p2); System.out.println("Tich: " + pTich);

        // Test phép chia
        PhanSo pThuong = p1.chia(p2); System.out.println("Thuong: " + pThuong);

        // Test so sánh
        System.out.println(p1.soSanh(p2));
    }
}
