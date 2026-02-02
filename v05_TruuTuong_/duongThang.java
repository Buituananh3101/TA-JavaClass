package v05_TruuTuong_;

public class duongThang implements iShape{
    private double weight;
    private Diem a,b;
    public duongThang() {
    }
    public duongThang(double weight, Diem a, Diem b) {
        this.weight = weight;
        this.a = a;
        this.b = b;
    }
    @Override
    public String toString() {
        return String.format("duongThang [weight=%.2f, a=%s, b=%s]", weight, a.toString(), b.toString());
    }
    @Override
    public double area() {
        return 0;
    }
    @Override
    public double perimeter() {
        return weight;
    }
    @Override
    public void moveSelf(double dx, double dy) {
        a.moveSelf(dx, dy);
        b.moveSelf(dx, dy);
    }
    @Override
    public iShape moveNew(double dx, double dy) {
        return new duongThang(weight,a.moveNew(dx, dy),b.moveNew(dx, dy));
    }
    
    @Override
    public iShape zoom(double ratio) {
        return new duongThang(weight * ratio, (Diem)a.zoom(ratio), (Diem)b.zoom(ratio));
    }

    
}
