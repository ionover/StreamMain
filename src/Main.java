import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> positiveNumbers = new ArrayList<>();

        for (int num: list) {
            if (num > 0) {
                positiveNumbers.add(num);
            }
        }
        List<Integer> evenNumbers = new ArrayList<>();
        for (int num: positiveNumbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }

        System.out.println(positiveNumbers);
        System.out.println(evenNumbers);
        Collections.sort(evenNumbers);
        System.out.println(evenNumbers);


    }
}