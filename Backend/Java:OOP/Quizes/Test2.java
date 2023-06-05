
import java.util.*;

public class Test2 {
    public int nSUN(int n, int[] primes) {
        PriorityQueue<long[]> pq = new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));
        for(int prime : primes) {
            pq.offer(new long[]{prime, prime, 0});
        }
        long[] uglyNumbers = new long[n];
        uglyNumbers[0] = 1;
        for(int i = 1; i < n; ++i) {
            uglyNumbers[i] = pq.peek()[0];
            while(pq.peek()[0] == uglyNumbers[i]) {
                long[] next = pq.poll();
                pq.offer(new long[]{next[1]*uglyNumbers[(int)++next[2]], next[1], next[2]});
            }
        }
        return (int)uglyNumbers[n-1];
    }
    
    public static void main(String[] args) {
    	Test2 SUN = new Test2();
        int[] primes = {2,7,13,19};
        System.out.println(SUN.nSUN(12, primes));
        int[] primes2 = {2,3,5};
        System.out.println(SUN.nSUN(1, primes2));
    }
}
