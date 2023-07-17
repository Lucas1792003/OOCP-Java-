public class AString {
    private String str;
    public AString (String str){
        this.str = str;
    }
    public void setStr (String str){
        this.str = str;
    }
    public String getStr(){
        return str;
    }
    public void swap() {
        if (str.length() >= 2) {
            char first = str.charAt(0);
            char last = str.charAt(str.length() - 1);
            String middle = str.substring(1, str.length() - 1);
            str = last + middle + first;

        }
        setStr(str);
    }
}
