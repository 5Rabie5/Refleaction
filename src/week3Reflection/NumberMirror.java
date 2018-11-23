package week3Reflection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberMirror {
    String result;
    Integer number;

    public Integer mirror(Integer number) {
        String numberToString = number.toString();
        String[] split = numberToString.split("");
        List<String> list = Arrays.asList(split);
        ArrayList<String> numberToStrings = new ArrayList<>(list);
        Collections.reverse(numberToStrings);
        numberToString = String.join("", numberToStrings);
        Integer result = Integer.valueOf(numberToString);
        return result;
    }

    public Integer specialMirror(Integer number) {
        String numberToString = number.toString();
        String[] split = numberToString.split("");
        List<String> list = Arrays.asList(split);
        ArrayList<String> numberToStrings = new ArrayList<>(list);
        ArrayList<Integer> numbers = new ArrayList<>();

         for (numberToString:
               numberToStrings) {
             numbers.add(Integer.valueOf(numberToString));
          }

            for (Integer number3:  numbers) {
        if (number3 < 9) {
            number3 = number3 + 1;
        }
       number3 = 0;
   }


        Collections.reverse(numbers);
    Integer number1 =Integer.reverseBytes(234432);
        System.out.println(number1);
    numberToString =String.join("",numberToStrings);
    Integer result = Integer.valueOf(numberToString);
        return result;
}


}
