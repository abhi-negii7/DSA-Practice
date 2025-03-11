
public class _2Factorial {
    
    public static void main(String[] args){
        int n=4;
        // System.out.println(fact(n));
        fact2(n,1);

    }
    //functional
    public static int fact(int n){
        if(n==0 || n==1)
        return 1;
        return n*fact(n-1);
    }

    //parameterized
    public static void fact2(int n,int f){
        if(n==0 || n==1){
        System.out.println(f);
        return;
        }
        fact2(n-1,f*n);

    }
}
