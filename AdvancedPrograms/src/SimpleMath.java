/**
 * Created by Sai Krishna on 31-12-2015.
 */
public class SimpleMath {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println("The sum is: "+(a+b));
        System.out.println("The product is: "+(a*b));
        for(int i = 0;i<a;i++){
            b = b + i;
        }
        System.out.println("The value of b: "+b);
    }
}
