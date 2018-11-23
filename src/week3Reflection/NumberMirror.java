package week3Reflection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.lang.Integer.valueOf;

public class NumberMirror {
    String result;
    Integer number;
    Integer result2;

    public Integer mirror(Integer number) {
        String numberToString = number.toString();
        String[] split = numberToString.split("");
        List<String> list = Arrays.asList(split);
        ArrayList<String> numberToStrings = new ArrayList<>(list);
        Collections.reverse(numberToStrings);
        numberToString = String.join("", numberToStrings);
        Integer result = valueOf(numberToString);
        return result;
    }

    public Integer specialMirror(Integer number) {
        String numberToString = number.toString();
        String[] split = numberToString.split("");
        List<String> list = Arrays.asList(split);
        ArrayList<String> numberToStrings = new ArrayList<>(list);
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> numbers2 = new ArrayList<>();
        for (String numberToString3: numberToStrings) {
            numbers.add(valueOf(numberToString3));
        }

        for (Integer number3 : numbers) {
            if (number3 < 9) {
                number3 = number3 + 1;
                numbers2.add(number3);
            }else {
                number3 = 0;
                numbers2.add(number3);
            }
        }
       // System.out.println(numbers2);

        Collections.reverse(numbers2);
        ArrayList<String> numberToStrings2 = new ArrayList<>();

        for (Integer number4:numbers2             ) {
            numberToStrings2.add(number4.toString());
        }
        String numberToString4 = String.join("", numberToStrings2);

        Integer result2 = valueOf(numberToString4);
        System.out.println(result2);
        return result2;
    }


}
