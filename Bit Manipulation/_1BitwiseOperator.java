// BitWise Operator -> AND, OR, XOR, Left Shift, Right Shift
public class _1BitwiseOperator {

    public static void main(String[] args) {
        int a = 2;
        // AND(&)
        // 2 -> 10 -> (10) & (01) = 0
        System.out.println(a & 1);

        // OR(|)
        // 2 -> 10 -> (10) | (01) = 11 -> 3
        System.out.println(a | 1);

        // XOR(^)
        // 0^1 -> 1 , 1^0 -> 1 , 1^1 -> 0, 0 ^ 0 -> 0
        System.out.println(a ^ 1);

        // Complement(~) 
        // +ve Number -> 2 Compliment  , -ve Number -> add 1 and then filp bits
        System.out.println(~6);

        // Left Shift Operator (<<)
        // 100<<1 -> 1000
        // General Formula -> a<<b = a*(2^b) (^ means power here)
        System.out.println(4 << 1);

        // Right Shift Operator(>>)
        // 100>>1 -> 10
        // General Formula -> a>>b = a/(2^b)
        System.out.println(4 >> 1);
    }
}