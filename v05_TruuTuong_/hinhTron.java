package v05_TruuTuong_;

public class hinhTron implements iShape {
    private Diem i;
    private Double r;

    
    public hinhTron(Diem i, Double r) {
        this.i = i;
        this.r = r;
    }
    
    public hinhTron() {
    }
    

    @Override
    public String toString() {
        return String.format("hinhTron [i=%s, r=%.2f]", i.toString(), r);
    }

    @Override
    public double area() {
        return Math.PI*r*r;
    }
    @Override
    public double perimeter() {
        return 2*Math.PI*r;
    }
    @Override
    public void moveSelf(double dx, double dy) {
        i.moveSelf(dx, dy);
    }
    @Override
    public iShape moveNew(double dx, double dy) {
        return new hinhTron(i.moveNew(dx, dy), r);
    }
    
    @Override
    public iShape zoom(double ratio) {
        return new hinhTron((Diem) i.zoom(ratio), r * ratio);
    }

    
}
