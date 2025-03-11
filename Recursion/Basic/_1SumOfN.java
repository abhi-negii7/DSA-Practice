
public class _1SumOfN {
    
    public static void main(String[] args) {
        int n=6;
        findSum(n,0);
    }
    public static void findSum(int n,int sum){
        if(n==0){
        System.out.println(sum);
        return;
        }
        // findSum(n-1, sum+n);
        sum+=n;
        findSum(n-1, sum);
    }
}
