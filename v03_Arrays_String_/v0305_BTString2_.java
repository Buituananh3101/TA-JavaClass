package v03_Arrays_String_;

public class v0305_BTString2_ {
    public static void main(String[] args) {

        String si ="1 2.0 3 -5";    

        String[] so = si.split("\\s+");

        for (String string : so) {
            for(int i=0;i<string.length();i++){
                if(!String.valueOf(string.charAt(i)).matches("^[0-9.+\\-]+$")){
                    System.out.println("No");
                    return;
                };
            }   
        }
        System.out.println(so.length);

        Integer sum=0;
        for (String s : so) {
            sum+=Integer.parseInt(s);
        }
        System.out.println(sum);
    }
}
