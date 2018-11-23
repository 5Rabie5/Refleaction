package week3Reflection;

import java.util.Scanner;

public class NumberMirrorApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pleas enter Number");
        Integer number = scanner.nextInt();
        System.out.println("Your Number its : " + number);
        NumberMirror numberMirror = new NumberMirror();

        Integer mirroredNumber = numberMirror.mirror(number);
        Integer mirroredNumber2 = numberMirror.specialMirror(number);

        System.out.println("Your  mirrored Number its : " + mirroredNumber);
        System.out.println("Your  mirrored pecial Number its : " + mirroredNumber2);
    }
}
