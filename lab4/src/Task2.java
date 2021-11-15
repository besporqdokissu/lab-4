//Знайти суму елементів, що більші 3 і індекс яких кратний 2

import java.util.Arrays;

public class Task2 {
    static double sum(double... arr) {
        Arrays.toString(arr);
        double sum = 0;
        boolean conditionMet = false;
        for (int i = 2; i < arr.length; i += 2) {
            if (arr[i] > 3) {
                sum += arr[i];
                conditionMet = true;
            }
            if (i + 2 > arr.length)
                break;
        }
        if (conditionMet)
            return sum;
        else
            throw new IllegalArgumentException("условие не соблюдено");
    }
}
