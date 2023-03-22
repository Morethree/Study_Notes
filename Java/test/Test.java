package Java.test;

import java.util.function.Function;

public class Test {
    
    public long measureSumPerf(Function<Long,Long> adder,long n){
        long fastest = Long.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            long start = System.nanoTime();
            long sum = adder.apply(n);
            long duraion = (System.nanoTime() - start) / 1_000_000;
            System.out.println("Result:" + sum);
            if(duraion < fastest) fastest=duraion;
        }
        return fastest;
    }
    public static void main(String[] args) {
        System.out.println("xyc");
    }
}
