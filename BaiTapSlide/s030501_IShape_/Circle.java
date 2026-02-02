package BaiTapSlide.s030501_IShape_;

/**
 * Class đại diện cho hình tròn
 */
public class Circle implements IShape {
    private Point center;
    private double radius;
    
    /**
     * Constructor mặc định
     */
    public Circle() {
        this(new Point(0, 0), 1.0);
    }
    
    /**
     * Constructor với tâm và bán kính
     * @param center tâm của hình tròn
     * @param radius bán kính
     */
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = Math.abs(radius);
    }
    
    // Getters
    public Point getCenter() {
        return center;
    }
    
    public double getRadius() {
        return radius;
    }
    
    @Override
    public String toString() {
        return String.format("Circle[center=%s, radius=%.2f]", center, radius);
    }
    
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
    
    @Override
    public void moveSelf(double dx, double dy) {
        center.moveSelf(dx, dy);
    }
    
    @Override
    public IShape moveNew(double dx, double dy) {
        return new Circle(center.moveNew(dx, dy), radius);
    }
    
    @Override
    public IShape zoom(double ratio) {
        return new Circle((Point) center.zoom(ratio), radius * Math.abs(ratio));
    }
}
