package v03_Arrays_String_;

public class v0305_BTString1_ {
    public static void main(String[] args) {
        String si="Lap trinh java khong don gian";
        String so="";
        for(int i=0;i<si.length();i++){
            if(!String.valueOf(si.charAt(i)).equals("a")) so+=si.charAt(i);
        }
        for(int i=so.length()-1;i>=0;i--){
            System.out.print(so.charAt(i));
        }
        
    }
}
