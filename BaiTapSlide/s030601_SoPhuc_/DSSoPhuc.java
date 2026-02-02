package BaiTapSlide.s030601_SoPhuc_;

import java.util.ArrayList;

public class DSSoPhuc {
    ArrayList<SoPhuc> a;
    

    public DSSoPhuc() {
        this.a = new ArrayList<SoPhuc>();
    }

    // TBC
    public SoPhuc tBC(){
        Integer a=0,b=0;
        for (SoPhuc p : this.a) {
            a+=p.getA();
            b+=p.getB();
        }
        int n=this.a.size();
        if(n==0) return new SoPhuc(0,0);
        else                 return new SoPhuc(a/n,b/n);
    }

    // Mod max
    public SoPhuc modMax(){
        double m=0;
        SoPhuc tmp=new SoPhuc(0,0);
        for (SoPhuc p : a) {
            if(m<p.mod()){
                m=p.mod();
                tmp=p;
            }
        }
        return tmp;
    }
    // Đếm ko có ảo
    public int count(){
        int c=0;
        for (SoPhuc p : a) if(p.getB()==0) c++;
        return c;
        
    }

    // hỗ trợ
    public void put(int x, int y){
        a.add(new SoPhuc(x,y));
    }
    public void xuat(){
        a.forEach(x->System.out.println(x));
    }
}
