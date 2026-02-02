package BaiTapSlide.s030501_IShape_;

/**
 * Class đại diện cho một điểm trong hệ tọa độ 2D
 */
public class Point implements IShape {
    private double x;
    private double y;
    
    /**
     * Constructor mặc định
     */
    public Point() {
        this(0, 0);
    }
    
    /**
     * Constructor với tọa độ
     * @param x hoành độ
     * @param y tung độ
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    // Getters
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    @Override
    public String toString() {
        return String.format("Point[x=%.2f, y=%.2f]", x, y);
    }
    
    @Override
    public double area() {
        return 0.0;
    }
    
    @Override
    public double perimeter() {
        return 0.0;
    }
    
    @Override
    public void moveSelf(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }
    
    @Override
    public Point moveNew(double dx, double dy) {
        return new Point(this.x + dx, this.y + dy);
    }
    
    @Override
    public IShape zoom(double ratio) {
        return new Point(this.x * ratio, this.y * ratio);
    }
    
    /**
     * Tính khoảng cách đến một điểm khác
     * @param other điểm cần tính khoảng cách
     * @return khoảng cách Euclid
     */
    public double distanceTo(Point other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
