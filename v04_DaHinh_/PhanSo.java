package v04_DaHinh_;

public class PhanSo {
    private int T;
    private int M;

    private static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }

    public int getT() {
        return T;
    }

    public int getM() {
        return M;
    }

    public PhanSo(int t, int m) {
        T = t;
        M = m;
    }

    public void setT(int t) {
        T = t;
    }

    public void setM(int m) {
        M = m;
    }

    public PhanSo() {
    }

    @Override
    public String toString() {
        return "PhanSo [T=" + T + ", M=" + M + "]";
    }

    public static PhanSo rutGon(int tu, int mau){
        int g = gcd(tu,mau);
        return new PhanSo(tu/g,mau/g);
    }

    public static PhanSo hieu(PhanSo a, PhanSo b){
        int tu = (a.T*b.M-b.T*a.M);
        int mau = (a.M*b.M);
        return rutGon(tu, mau);
    }

    public static PhanSo tong(PhanSo a, PhanSo b){
        int tu = (a.T*b.M+b.T*a.M);
        int mau = (a.M*b.M);
        return rutGon(tu, mau);
    }

    public static Boolean less(PhanSo a, PhanSo b){
        int tu = a.T*b.M;
        int tuu = b.T*a.M;
        return tu<tuu;
    }
    
    public static void main(String[] args) {
        PhanSo s = new PhanSo(1,1);
        PhanSo x = new PhanSo(1,3);
        System.out.println(s.toString());
        System.out.println(hieu(s,x).toString());
        System.out.println(less(s, x));
    }

}
