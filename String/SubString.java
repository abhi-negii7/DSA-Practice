public class SubString {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(subString(str, 2, 6));
        System.out.println(str.substring(2, 6)); // inbuild function substring()
    }

    public static String subString(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }
}
