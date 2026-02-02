package v05_TruuTuong_Clean_;

/**
 * Interface định nghĩa các hình học cơ bản
 */
public interface IShape {
    
    /**
     * Tính diện tích của hình
     * @return diện tích
     */
    double area();
    
    /**
     * Tính chu vi của hình
     * @return chu vi
     */
    double perimeter();
    
    /**
     * Tịnh tiến chính hình này
     * @param dx độ dịch chuyển theo trục x
     * @param dy độ dịch chuyển theo trục y
     */
    void moveSelf(double dx, double dy);
    
    /**
     * Tạo một hình mới đã được tịnh tiến
     * @param dx độ dịch chuyển theo trục x
     * @param dy độ dịch chuyển theo trục y
     * @return hình mới sau khi tịnh tiến
     */
    IShape moveNew(double dx, double dy);
    
    /**
     * Phóng to/thu nhỏ hình theo tỷ lệ
     * @param ratio tỷ lệ phóng (>1: phóng to, <1: thu nhỏ)
     * @return hình mới sau khi zoom
     */
    IShape zoom(double ratio);
}
