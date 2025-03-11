
public class BasicOfStr {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");
        // This is because java have a concept called interning
        System.out.println(s1 == s2); // True
        System.out.println(s1 == s3); // False
        System.out.println(s2 == s3); // False
        
        //Explanation -> When you make a string not with new keyword it point to the old string ony.
        //So we use equals() method
        System.out.println(s1.equals(s3));
    }
}
