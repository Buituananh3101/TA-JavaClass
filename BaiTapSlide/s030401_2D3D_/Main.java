package BaiTapSlide.s030401_2D3D_;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Tạo một danh sách điểm bao gồm 2D và 3D
        ArrayList<P2D> a = new ArrayList<>();
        a.add(new P2D(-1,-1));
        a.add(new P2D(1,2));
        a.add(new P3D(1,1,1));
        a.add(new P3D(1,1,2));
        
        // Tính tổng khoảng cách các điểm 2D và tổng khoảng cách các điểm 3D
        double sum2D=0;
        double sum3D=0;
        P2D goc2D = new P2D(0, 0);
        P3D goc3D = new P3D(0, 0, 0);

        for (P2D p2d : a) {
            if (p2d.getClass() == P3D.class) sum3D += ((P3D) p2d).dis(goc3D);
            else sum2D += p2d.dis(goc2D);
        }
        System.out.printf("%.2f\n",sum2D);
        System.out.println(sum3D);

        // Thêm các điểm đối xứng và in
        ArrayList<P2D> b = new ArrayList<>(a);
        for (P2D p : b) {
            a.add(p.doiXung());
        }
        a.forEach(x->System.out.println(x));

    }
}
