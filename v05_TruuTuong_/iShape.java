package v05_TruuTuong_;

public interface iShape {

    public double area();
    public double perimeter();

    public void moveSelf(double dx, double dy); // tự tịnh tiến
    public iShape moveNew(double dx, double dy); // đưa điểm mới
    
    public iShape zoom(double ratio); 

    // ko phải override, ko để trong interface
    // public double dis(iShape s);
    
}
