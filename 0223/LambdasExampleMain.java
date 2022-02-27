public class LambdasExampleMain{
    public static void main(String[] args) {
        System.out.println("Task2/a");
        LambdasExample.printNum.accept(3);

        System.out.println("Task2/b");
        LambdasExample.printNumRandom.accept(4);

        System.out.println("Task2/c");
        System.out.println("First Run");
        LambdasExample.printCounter.accept(2);
        System.out.println("Second Run");
        LambdasExample.printCounter.accept(2);
        System.out.println("Third Run");
        LambdasExample.printCounter.accept(2);
    }
}