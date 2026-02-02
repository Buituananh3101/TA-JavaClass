package BaiTapSlide.s030601_SoPhuc_;

public class Main {
    public static void main(String[] args) {
        DSSoPhuc ds = new DSSoPhuc();
        ds.put(1, 2);
        ds.put(3, 4);
        ds.put(5, 0);
        ds.put(-2, 1);
        ds.put(0, 7);
        ds.put(4, -3);

        ds.xuat();

        System.out.println(ds.tBC());

        System.out.println(ds.modMax());

        System.out.println(ds.count());
    }
}
