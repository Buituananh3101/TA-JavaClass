package BaiTapSlide.s030501_IShape_;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Class chính để demo các hình học
 */
public class Main {
    
    private static final Random random = new Random();
    private static final int NUMBER_OF_SHAPES = 10;
    
    public static void main(String[] args) {
        System.out.println("=== CHUONG TRINH QUAN LY CAC HINH HOC ===\n");
        
        // Tạo danh sách các hình ngẫu nhiên
        List<IShape> shapes = createRandomShapes(NUMBER_OF_SHAPES);
        
        // Hiển thị danh sách các hình
        displayShapes(shapes);
        
        // Tính toán và hiển thị thống kê
        displayStatistics(shapes);
    }
    
    /**
     * Tạo danh sách các hình ngẫu nhiên
     * @param count số lượng hình cần tạo
     * @return danh sách các hình
     */
    private static List<IShape> createRandomShapes(int count) {
        List<IShape> shapes = new ArrayList<>();
        
        for (int i = 0; i < count; i++) {
            IShape shape = createRandomShape();
            shapes.add(shape);
        }
        
        return shapes;
    }
    
    /**
     * Tạo một hình ngẫu nhiên
     * @return hình ngẫu nhiên (Point, Circle, Rectangle, hoặc Line)
     */
    private static IShape createRandomShape() {
        int shapeType = random.nextInt(4);
        
        switch (shapeType) {
            case 0:
                return new Point(
                    randomDouble(0, 10), 
                    randomDouble(0, 10)
                );
                
            case 1:
                return new Circle(
                    new Point(randomDouble(0, 10), randomDouble(0, 10)), 
                    randomDouble(1, 5)
                );
                
            case 2:
                return new Rectangle(
                    randomDouble(1, 10), 
                    randomDouble(1, 10), 
                    new Point(randomDouble(0, 10), randomDouble(0, 10))
                );
                
            case 3:
                return new Line(
                    randomDouble(0.5, 5), 
                    new Point(randomDouble(0, 10), randomDouble(0, 10)), 
                    new Point(randomDouble(0, 10), randomDouble(0, 10))
                );
                
            default:
                return new Point(0, 0);
        }
    }
    
    /**
     * Tạo số thực ngẫu nhiên trong khoảng [min, max]
     */
    private static double randomDouble(double min, double max) {
        return min + random.nextDouble() * (max - min);
    }
    
    /**
     * Hiển thị danh sách các hình
     */
    private static void displayShapes(List<IShape> shapes) {
        System.out.println("--- DANH SACH CAC HINH ---");
        for (int i = 0; i < shapes.size(); i++) {
            System.out.printf("%2d. %s\n", i + 1, shapes.get(i));
        }
        System.out.println();
    }
    
    /**
     * Tính toán và hiển thị các thống kê
     */
    private static void displayStatistics(List<IShape> shapes) {
        double totalArea = 0;
        double totalPerimeter = 0;
        
        IShape maxAreaShape = null;
        IShape minAreaShape = null;
        double maxArea = Double.MIN_VALUE;
        double minArea = Double.MAX_VALUE;
        
        // Tính toán
        for (IShape shape : shapes) {
            double area = shape.area();
            double perimeter = shape.perimeter();
            
            totalArea += area;
            totalPerimeter += perimeter;
            
            // Tìm hình có diện tích lớn nhất
            if (area > maxArea) {
                maxArea = area;
                maxAreaShape = shape;
            }
            
            // Tìm hình có diện tích nhỏ nhất (khác 0)
            if (area < minArea) {
                minArea = area;
                minAreaShape = shape;
            }
        }
        
        // Hiển thị kết quả
        System.out.println("--- THONG KE ---");
        System.out.printf("Tong dien tich: %.2f\n", totalArea);
        System.out.printf("Tong chu vi: %.2f\n\n", totalPerimeter);
        
        System.out.println("Hinh co dien tich lon nhat:");
        System.out.printf("  %s\n", maxAreaShape);
        System.out.printf("  Dien tich: %.2f\n\n", maxArea);
        
        System.out.println("Hinh co dien tich nho nhat:");
        System.out.printf("  %s\n", minAreaShape);
        System.out.printf("  Dien tich: %.2f\n", minArea);
    }
}