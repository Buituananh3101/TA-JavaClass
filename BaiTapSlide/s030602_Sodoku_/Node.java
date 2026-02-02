package BaiTapSlide.s030602_Sodoku_;

public class Node {
    private int x; // Dòng (Row)
    private int y; // Cột (Column)
    private int value; // Giá trị (0 là ô trống)
    private boolean isFixed; // Đánh dấu ô cố định (đề bài cho trước) để không cho sửa

    public Node(int x, int y, int value) {
        this.x = x;
        this.y = y;
        this.value = value;
        // Nếu giá trị khởi tạo khác 0, coi như là ô đề bài cho, không được sửa
        this.isFixed = (value != 0);
    }

    // Getters
    public int getX() { return x; }
    public int getY() { return y; }
    public int getValue() { return value; }
    public boolean isFixed() { return isFixed; }

    // Setters
    public void setValue(int value) {
        if (!isFixed) {
            this.value = value;
        }
    }
}