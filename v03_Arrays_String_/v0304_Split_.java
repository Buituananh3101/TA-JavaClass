package v03_Arrays_String_;

public class v0304_Split_ {
    public static void main(String[] args) {
        String s="1,2,3,4";
        String[] a = s.split(",");
        for (String string : a) {
            System.out.println(string);
        }
    }
}
