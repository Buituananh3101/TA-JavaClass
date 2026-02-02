package v03_Arrays_String_;
public class v0303_String_ {
    // String pool - Heap
    // == là so sánh địa chỉ
    // .equal() mới là so sanh giá trị
    public static void main(String[] args) {
        String s1= "abc";
        String s2= "abc";
        String s3= new String("abc");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
    }
}
