
public class Main {

    public static void main(String[] args) {

        //16 Знайти середнє геометричне парних елементів масиву
        try {
            System.out.println(Task1.geometricMean(2, 8));
            System.out.println(Task1.geometricMean(1, 3));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }


        //46 Знайти суму елементів, що більші 3 і індекс яких кратний 2
        try {
            System.out.println("\n\n" + Task2.sum(-1, -1, 4, 0, 3, 0, 6));
            System.out.println(Task2.sum(0, 4, 3));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }


        //62 Задано масив цілих чисел. Сформувати новий масив у наступний
        //спосіб: поділити усі елементи масиву на його найменший елемент,
        //якщо найменший елемент відмінний від нуля; якщо ж найменший
        //елемент дорівнює нулю, то всі елементи  масиву замінити на - 10.
        try {
            System.out.println("\n\n" + ArrayPrinter.arrToString(Task3.modifiedArray(2, -1, 4, 7, -2)));
            System.out.println(ArrayPrinter.arrToString(Task3.modifiedArray(0, 1, 2, 3, 4, 5)));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}

//ВИМОГИ

//- В одному з завдань обов’язково має бути використаний цикл «for»

//- В одному з завдань обов’язково має бути використаний цикл «for-each»

//- Кожне завдання має бути реалізовано як окремий клас.

//- Клас може містити інші допоміжні методи.
