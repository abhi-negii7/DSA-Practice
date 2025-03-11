public class _1StringFunLeetcode {
    public static void main(String[] args) {
        String name = "Abhi Negi";
        String name2=changeToChar(name);
        System.out.println(name2);
    }
    public static String changeToChar(String name){
        char ch[]=name.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='a' || ch[i]=='A'){
                ch[i]='N';
            }
        }
        return new String(ch);
    }
}
