package v03_Arrays_String_;

import java.util.Random;

public class v0302_BTMangThuong_ {
    public static class So {
        private int[] a;
        @SuppressWarnings("unused")
        private int n;

        So(int n){
            a = new int[n];
            this.n=n;
            Random rand = new Random();
            for(int i=0;i<n;i++){
                a[i]=rand.nextInt(100);;
            }
        }

        public int demDuongKoChiaHetCho(int s){
            int cnt=0;
            for (int x : a) if(x>0 && x%s!=0) cnt++;
            return cnt;
        }

        public Double TongTBDoan(Double a, Double b){
            Double sum=0d;
            int cnt=0;
            for (int x : this.a) {
                if(x>=a && x<=b){
                    sum+=x;
                    cnt++;
                }
            }
            return sum/cnt;
        }

        public int lonNhatChiaHetCho(int s){
            int max = Integer.MIN_VALUE ;
            for (int x : this.a) {
                if(x%s==0 && x>max) max = x;
            }
            return max;
        }

        public void sapXepGiaTriTuyetDoiTangDan(){
            
        }

    }

    public static void main(String[] args) {
        So s = new So(10);
        System.out.println(s.demDuongKoChiaHetCho(3));
        System.out.println(s.TongTBDoan(-5d, 25d));
        System.out.println(s.lonNhatChiaHetCho(3));


    }
}
