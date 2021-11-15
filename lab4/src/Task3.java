//Задано масив цілих чисел. Сформувати новий масив у наступний
//спосіб: поділити усі елементи масиву на його найменший елемент,
//якщо найменший елемент відмінний від нуля; якщо ж найменший
//елемент дорівнює нулю, то всі елементи  масиву замінити на - 10.

public class Task3 {

    static double[] modifiedArray(int... arr) {
        double[] modifiedArr = new double[arr.length];
        int min = findMinInteger(arr);
        if (min != 0) {
            for (int i = 0; i < modifiedArr.length; i++) {
                modifiedArr[i] = (double) arr[i] / min;
            }
        } else {
            for (int i = 0; i < modifiedArr.length; i++) {
                modifiedArr[i] = -10;
            }
        }
        return modifiedArr;
    }

    static int findMinInteger(int[] arr) {
        int min = arr[0];
        for (int j : arr) {
            if (j < min)
                min = j;
        }
        return min;
    }
}
