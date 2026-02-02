package v02_Nhap_Xuat_GoiHam_;

import java.util.Scanner;

public class Bai1 {

    public static Double chuVi(Double a, Double b){
        return 2*(a+b);
    }

    public static Double duongCheo(Double a, Double b){
        return Math.sqrt(a*a+b*b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double a = sc.nextDouble();
        Double b = sc.nextDouble();

        System.out.println(chuVi(a,b));
        System.out.println(duongCheo(a, b));

        sc.close();

    }
}
