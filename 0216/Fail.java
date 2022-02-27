public class Fail {
    public static int divideByZero(int n) {
        int s = n / 0;
        return s;
    }

    public static int outOfIndex(int[] array) {
        return array[array.length+10];
    }
}
