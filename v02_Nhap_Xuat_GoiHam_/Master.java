package v02_Nhap_Xuat_GoiHam_;

import java.util.Scanner;

public class Master {

    public static void main(String[] args) {

        System.out.println("Lo");

        float mu = (float) Math.pow(2, 3);

        System.out.println("Mu la: " + mu);

        System.out.println(Math.PI);

        
        Scanner sc = new Scanner(System.in);
        Double a = sc.nextDouble();
        System.out.println("So vua nhap: "+a);



        sc.close();
    }

}
