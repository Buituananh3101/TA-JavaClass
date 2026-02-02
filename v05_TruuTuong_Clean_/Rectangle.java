package v05_TruuTuong_Clean_;

/**
 * Class đại diện cho hình chữ nhật
 */
public class Rectangle implements IShape {
    private double width;
    private double height;
    private Point center;
    
    /**
     * Constructor mặc định
     */
    public Rectangle() {
        this(1.0, 1.0, new Point(0, 0));
    }
    
    /**
     * Constructor với chiều dài, chiều rộng và tâm
     * @param width chiều rộng
     * @param height chiều cao
     * @param center tâm của hình chữ nhật
     */
    public Rectangle(double width, double height, Point center) {
        this.width = Math.abs(width);
        this.height = Math.abs(height);
        this.center = center;
    }
    
    // Getters
    public double getWidth() {
        return width;
    }
    
    public double getHeight() {
        return height;
    }
    
    public Point getCenter() {
        return center;
    }
    
    @Override
    public String toString() {
        return String.format("Rectangle[width=%.2f, height=%.2f, center=%s]", 
                           width, height, center);
    }
    
    @Override
    public double area() {
        return width * height;
    }
    
    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
    
    @Override
    public void moveSelf(double dx, double dy) {
        center.moveSelf(dx, dy);
    }
    
    @Override
    public IShape moveNew(double dx, double dy) {
        return new Rectangle(width, height, center.moveNew(dx, dy));
    }
    
    @Override
    public IShape zoom(double ratio) {
        double absRatio = Math.abs(ratio);
        return new Rectangle(width * absRatio, height * absRatio, 
                           (Point) center.zoom(ratio));
    }
    
    /**
     * Tính khoảng cách giữa tâm của hai hình chữ nhật
     * @param other hình chữ nhật cần tính khoảng cách
     * @return khoảng cách giữa hai tâm
     */
    public double distanceTo(Rectangle other) {
        return this.center.distanceTo(other.center);
    }
}
