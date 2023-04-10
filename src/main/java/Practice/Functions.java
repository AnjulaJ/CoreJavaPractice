package Practice;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Functions {
    public static void main(String[] args) {

        // Function
        int number=increaseByOne(0);
        System.out.println(number);

        int number2=increaseByOneFunction.apply(1);
        System.out.println(number2);

        int multiply=multiplyBy10.apply(number2);
        System.out.println(multiply);

        int addOneAndMultiply=addOneAndMultiplyBy10Function.apply(1);
        System.out.println(addOneAndMultiply);

        // BiFunction
        System.out.println(increaseOneAndMultiply.apply(4,100));
    }

    static int increaseByOne(int num){
        return num + 1;
    }

    static Function<Integer, Integer> increaseByOneFunction = number ->number+1;

    static Function<Integer, Integer> multiplyBy10 = number ->number*10;

    static Function<Integer,Integer> addOneAndMultiplyBy10Function = increaseByOneFunction.andThen(multiplyBy10);

    static BiFunction<Integer, Integer, Integer> increaseOneAndMultiply = (addNum,multiplyNum) -> (addNum+1)*multiplyNum;
}