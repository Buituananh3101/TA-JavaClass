package v05_TruuTuong_;

public class Diem implements iShape{
    private double x,y;

    public Diem() {
    }

    public Diem(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("Diem [x=%.2f, y=%.2f]", x, y);
    }

    @Override
    public double area() {
        return 0f;
    }

    @Override
    public double perimeter() {
        return 0f;
    }

    @Override
    public void moveSelf(double dx, double dy) {
        this.x=this.x+dx;
        this.y=this.y+dy;
    }

    @Override //chú ý chỗ override này
    public Diem moveNew(double dx, double dy) {
        return new Diem(this.x+dx,this.y+dy);
    }
    
    @Override
    public iShape zoom(double ratio) {
        return new Diem(this.x * ratio, this.y * ratio);
    }

    // @Override // ko phải override, ko để ở interface
    public double dis(Diem s) {
        return Math.sqrt(Math.pow(this.x - s.x, 2) + Math.pow(this.y - s.y, 2));
    }

   
    
    
}
