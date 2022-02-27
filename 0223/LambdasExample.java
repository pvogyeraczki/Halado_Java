import java.util.Random;
import java.util.function.Consumer;
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
}
