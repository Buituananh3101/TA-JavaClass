package v05_TruuTuong_;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // iShape[] h = new iShape[4];
        
        // Random rd= new Random();
        // for(int i=0;i<4;i++){
        //     int chon = rd.nextInt(0,2);
        //     if(chon==0) h[i] = new duongThang(1.0,new Diem(0,0), new Diem(0,1));
        //     if(chon==1) h[i] = new hinhTron(new Diem(0,0),1.0);
        //     if(chon==2) h[i] = new hinhChuNhat(3.0,2.0,new Diem(1,1));
        // }

        // for(iShape a: h) System.out.println(a);
        
        // // Tìm hình có s > và <
        // double smx = Double.MIN_VALUE;
        // double smi = Double.MAX_VALUE;
        // iShape hmx = null;
        // iShape dhmi = null;
        
        // for(iShape a: h){
        //     double area = a.area();
        //     if(area > smx && area > 0) {
        //         smx = area;
        //         hmx = a;
        //     }
        //     if(area < smi && area > 0) {
        //         smi = area;
        //         dhmi = a;
        //     }
        // }
        
        // System.out.println("Hình có s >: " + hmx + " với s = " + smx);
        // System.out.println("Hình có s <: " + dhmi + " với s = " + smi);
        
        // if(hmx != null) {
        //     System.out.println("Hình > sau zoom: " + hmx.zoom(2));
        // }
        // if(dhmi != null) {
        //     System.out.println("Hình < sau zoom: " + dhmi.zoom(2));
        // }

        // Tạo một tập các hình ngẫu nhiên và đưa vào trong danh sách để quản lý.
        ArrayList<iShape> a = new ArrayList<>();
        Random rd = new Random();
        int n = 10; 
        for (int i = 0; i < n; i++) {
            int chon = rd.nextInt(4);
            if      (chon == 0) a.add(new Diem(rd.nextDouble(10), rd.nextDouble(10)));
            else if (chon == 1) a.add(new hinhTron(new Diem(rd.nextDouble(10), rd.nextDouble(10)), rd.nextDouble(5)));
            else if (chon == 2) a.add(new hinhChuNhat(rd.nextDouble(10), rd.nextDouble(10), new Diem(rd.nextDouble(10), rd.nextDouble(10))));
            else                a.add(new duongThang(rd.nextDouble(5), new Diem(rd.nextDouble(10), rd.nextDouble(10)), new Diem(rd.nextDouble(10), rd.nextDouble(10))));   
        }
        a.forEach(x->System.out.println(x));

        // Tính tổng chu vi/diện tích các hình đã tạo ra và tìm hình có diện tích lớn nhất/ nhỏ nhất
        double tongS = 0;
        double tongC = 0;
        double maxS = Double.MIN_VALUE;
        double minS = Double.MAX_VALUE;
        iShape maxH = null;
        iShape minH = null;

        for (iShape shape : a) {
            double s = shape.area();
            double c = shape.perimeter();
            
            tongS += s;
            tongC += c;

            if (s > maxS) {
                maxS = s;
                maxH = shape;
            }
            if (s < minS) {
                minS = s;
                minH = shape;
            }
        }

        System.out.printf("Tổng diện tích: %.2f\n", tongS);
        System.out.printf("Tổng chu vi: %.2f\n", tongC);
        System.out.println("Hình có diện tích lớn nhất: " + maxH + " (S=" + maxS + ")");
        System.out.println("Hình có diện tích nhỏ nhất: " + minH + " (S=" + minS + ")");

    }
}
