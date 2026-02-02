package v04_DaHinh_;

public class P3D extends P2D {
    
    protected int z;

    public P3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    // Dis
    public float dis(P3D a){
        return (float)Math.sqrt((x - a.x) * (x - a.x) + (y - a.y) * (y - a.y) + (z - a.z) * (z - a.z));
    }
    // Đối xứng
    public P3D doiXung(){
        return new P3D(-x,-y,-z);
    }
    // Tịnh tiến
    public P3D tinhTien(int xx, int yy, int zz){ 
        return new P3D(x + xx, y + yy,z+zz);
    }

   

}