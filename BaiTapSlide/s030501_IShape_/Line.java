package BaiTapSlide.s030501_IShape_;

/**
 * Class đại diện cho đoạn thẳng (Line segment)
 */
public class Line implements IShape {
    private double weight;
    private Point startPoint;
    private Point endPoint;
    
    /**
     * Constructor mặc định
     */
    public Line() {
        this(1.0, new Point(0, 0), new Point(1, 1));
    }
    
    /**
     * Constructor với độ dày và hai điểm đầu cuối
     * @param weight độ dày của đường thẳng
     * @param startPoint điểm đầu
     * @param endPoint điểm cuối
     */
    public Line(double weight, Point startPoint, Point endPoint) {
        this.weight = Math.abs(weight);
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }
    
    // Getters
    public double getWeight() {
        return weight;
    }
    
    public Point getStartPoint() {
        return startPoint;
    }
    
    public Point getEndPoint() {
        return endPoint;
    }
    
    /**
     * Tính độ dài của đoạn thẳng
     * @return độ dài
     */
    public double length() {
        return startPoint.distanceTo(endPoint);
    }
    
    @Override
    public String toString() {
        return String.format("Line[weight=%.2f, start=%s, end=%s, length=%.2f]", 
                           weight, startPoint, endPoint, length());
    }
    
    @Override
    public double area() {
        return 0.0; // Đường thẳng không có diện tích
    }
    
    @Override
    public double perimeter() {
        return weight; // Có thể hiểu là độ dày của đường
    }
    
    @Override
    public void moveSelf(double dx, double dy) {
        startPoint.moveSelf(dx, dy);
        endPoint.moveSelf(dx, dy);
    }
    
    @Override
    public IShape moveNew(double dx, double dy) {
        return new Line(weight, 
                       startPoint.moveNew(dx, dy), 
                       endPoint.moveNew(dx, dy));
    }
    
    @Override
    public IShape zoom(double ratio) {
        double absRatio = Math.abs(ratio);
        return new Line(weight * absRatio, 
                       (Point) startPoint.zoom(ratio), 
                       (Point) endPoint.zoom(ratio));
    }
}
