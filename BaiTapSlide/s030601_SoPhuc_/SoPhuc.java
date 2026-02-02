package BaiTapSlide.s030601_SoPhuc_;

public class SoPhuc {
    // Dn ET
    Integer a,b;
    // Cons defaut
    public SoPhuc() {
        this.a = 1;
        this.b = -1;
    }
    // Cons có đối
    public SoPhuc(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }
    // Cong
    public SoPhuc cong(SoPhuc p){
        return new SoPhuc(a+p.a,b+p.b);
    }
    // Mod
    public Double mod(){
        return Math.sqrt(a*a + b*b);
    }
    // Bổ trợ
    @Override
    public String toString() {
        return a+" + "+b+"i";
    }
    public Integer getA() {
        return a;
    }
    public Integer getB() {
        return b;
    }
    
    
    
}
