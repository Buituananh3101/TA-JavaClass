package v02_Nhap_Xuat_GoiHam_;

public class Bai2 {
  

    public static Double daThuc(int n, int x){
        Double sum=1.0;
        int m=n;
        for(int i=1;i<=n;i++){
            sum+=sum*(((m--)*x)/i);
        }
        return sum;
    }

    public static Long timBo(Double d){
        Long x=0l;
        Long y=1l;
        if(d<=0) return 0l;
        if(d<=1) return 1l;

        while (y<=d) {
            Long tmp = y;
            y=x+y;
            x=tmp;
        }

        return x;

    }
    public static void main(String[] args) {
        System.out.println(timBo(daThuc(3, 1)));
    }
}

// 1 + 3 + 3 + 1