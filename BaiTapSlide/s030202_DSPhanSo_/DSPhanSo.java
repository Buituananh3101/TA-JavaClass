package BaiTapSlide.s030202_DSPhanSo_;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import BaiTapSlide.s030201_PhanSo_.*;

public class DSPhanSo {
    private ArrayList<PhanSo> a;

    public DSPhanSo(File file) throws IOException{
        Scanner sc = new Scanner(file);
        Integer n = Integer.parseInt(sc.nextLine().trim());
        a =new ArrayList<>();
        for(int i=0;i<n;i++) a.add(new PhanSo(Integer.parseInt(sc.nextLine().trim()),Integer.parseInt(sc.nextLine().trim())));
        sc.close();
    }

    // Tổng mảng
    public PhanSo sum(){
        PhanSo s = new PhanSo(0,1);
        for (PhanSo p : a) s=s.cong(p);
        return s;
    }

    //Tìm PS max
    public PhanSo max(){
        Collections.sort(a, new Comparator<PhanSo>(){
            public int compare(PhanSo a, PhanSo b){
                return b.soSanh(a);
            }
        });
        return a.get(0);
    }

    // Xác định số phân số không phải số nguyên.
    public int count(){
        int c=0;
        for (PhanSo p : a) if(!p.isInt()) c++;
        return c;
    }

    public static void main(String[] args) throws IOException {
        String path = "D:\\CODE\\Class-Java\\BaiTapSlide\\s030202\\PhanSo.txt";
        File file = new File(path);
        DSPhanSo ds = new DSPhanSo(file);

        System.out.println(ds.sum());
        System.out.println(ds.max());
        System.out.println(ds.count());

    }
}
