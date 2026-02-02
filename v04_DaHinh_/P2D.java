package v04_DaHinh_;

public class P2D {
    protected int x; 
    protected int y;

    public P2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // Dis
    public float dis(P2D a){
        return (float)Math.sqrt((x - a.x) * (x - a.x) + (y - a.y) * (y - a.y));
    }
    // Đối xứng
    public P2D doiXung(){
        return new P2D(-x,-y);
    }
    // Tịnh tiến
    public P2D tinhTien(int xx, int yy){ 
        return new P2D(x + xx, y + yy);
    }

}