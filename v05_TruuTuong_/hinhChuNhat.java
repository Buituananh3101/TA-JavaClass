package v05_TruuTuong_;
// thi giữa kì có phần này interface
public class hinhChuNhat implements iShape {
    private double cd,cr;
    private Diem tam;
    public hinhChuNhat() {
    }
    public hinhChuNhat(double cd, double cr, Diem tam) {
        this.cd = cd;
        this.cr = cr;
        this.tam = tam;
    }
    
    @Override
    public String toString() {
        return String.format("hinhChuNhat [cd=%.2f, cr=%.2f, tam=%s]", cd, cr, tam.toString());
    }
    @Override
    public double area() {
        return cd*cr;
    }
    @Override
    public double perimeter() {
        return (cd+cr)*2;
    }
    @Override
    public void moveSelf(double dx, double dy) {
        tam.moveSelf(dx, dy);
    }
    @Override
    public iShape moveNew(double dx, double dy) {
        return new hinhChuNhat(cd, cr,tam.moveNew(dx, dy));
    }
    
    @Override
    public iShape zoom(double ratio) {
        return new hinhChuNhat(cd * ratio, cr * ratio, (Diem) tam.zoom(ratio));
    }

    public double dis(hinhChuNhat s){
        return this.tam.dis(s.tam);
    }
}
