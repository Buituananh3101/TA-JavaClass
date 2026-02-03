package BaiTapSlide.s020101_BTString_;

public class BTString {

    public static int count(String s){
        String[] a = s.split("\\s+");

        int n=0;
        for (String num : a) {
            if(!num.matches("[+-]?[0-9]+(\\.[0-9]+)?")){
                n=0;
                System.out.println("None <-- "+num);
                return -1;
            }
            n++;
        }
        return n;

    }

    public static void main(String[] args) {

        // // Xóa một kí tự bằng mẹo:)
        // System.out.println("Hello".replace("l", ""));

        // // Đảo ngược chuỗi
        // StringBuilder sbder = new StringBuilder("An");
        // System.out.println(sbder.reverse().toString());

        // Tách chuỗi & kiểm tra là số ko
        String s="1 2 3 -4 5.7 6 7 8 9 10";
        
        System.out.println(count(s));
        
        // 

    }
}
