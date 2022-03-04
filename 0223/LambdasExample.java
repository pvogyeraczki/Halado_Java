import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class LambdasExample {
        //task 1

        public static Supplier<Integer> positiveWholeNumbers = new Supplier<Integer>() {
            private int number = 0;

            @Override
            public Integer get() {
                return ++number;
            }
        };

        private static int[] counter = {0};
        public static Supplier<Integer> positiveWholeNumbers2 = () -> ++counter[0];

        public static Supplier<Supplier<Integer>> positive = () -> {
            int[] counter = {0};
            return () -> ++counter[0];
        };


        //task2/a
        public static Consumer<Integer> printNum = (Integer num) -> {
            for(int i = 0; i< num; ++i) {
                System.out.println(num);
            }
        };


        //task2/b
        public static Consumer<Integer> printNumRandom = (Integer num) -> {
            Random rand = new Random();

            Integer randomNum = rand.nextInt(10);

            for(int i = 0; i < randomNum; i++) {
                System.out.println(num);
            }
        };
        //task2/c
        public static int[] numOfRuns = {1};
        public static Consumer<Integer> printCounter = (Integer counter)-> {
            for(int i= 0; i < numOfRuns[0]; i++) {
                System.out.println(counter);
            }

            ++numOfRuns[0];
        };

        //task3/a

        public static Function<Integer, Integer> factorial = n -> {
            Integer pFactorial =  1;
            for(int i = 1; i <= n; i++) {
                pFactorial *= i;
            }

            return pFactorial;
        };

        //task3/b

        public static Function<Integer,Integer> facRecursive = new Function<Integer,Integer>() {
            @Override
            public Integer apply(Integer n) {
                if(n == 1) {
                    return 1;
                }

                return n * apply(n-1);
            }
        };

        //task4/iterative

        public static Function<Integer, Integer> fib = n -> {
            Integer[] f = new Integer[n+2];

            f[0] = 0;
    
            f[1] = 1;
    
            for(int i = 2; i <= n; i++) {
                f[i] = f[i-1] + f[i-2];
            }
    
            return f[n];
        };

        //task4/recursive

        public static Function<Integer, Integer> recFib  = new Function<Integer,Integer>() {
            @Override
            public Integer apply(Integer n) {
                if (n <= 1) {
                    return n;
                }
        
                return apply(n-1) + apply(n-2);
            }
        };

        //task5
        
        public static BiFunction<Map<String, Integer>, Map<String, Integer>, Map<String, Integer>> sum = (in1, in2) ->  {
            Map<String, Integer> out = new HashMap<>(in1);
            for(Map.Entry<String, Integer> enty : in2.entrySet()) {
                String key = enty.getKey();
                if(out.containsKey(key)) {
                    out.put(enty.getKey(), enty.getValue() + out.get(key));
                } else {
                    out.put(enty.getKey(), enty.getValue());
                }
            }

            return out;
        };

        //task6

        public static Predicate<Integer> isPrime = n -> {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };
}
