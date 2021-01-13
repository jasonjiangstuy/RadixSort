import java.lang.Math;
public class Radix{
    public static int nth(int n, int col){

        // nth(123,1) -> 2
        double temp = (double)n % Math.pow(10 ,col + 1);
        // System.out.println(temp);
        return ((int)(temp / Math.pow(10 ,col)));   

    }

	public static int length(int n){
        n = Math.abs(n);
        if (n == 0){
            return 1;
        }
        return ((int)Math.log10(n) + 1);        
    }
    public static void merge(MyLinkedList original,MyLinkedList[]buckets){
    }
} 