//Знайти середнє геометричне парних елементів масиву

class Task1 {
    static double geometricMean(double... arr) {
        double counter = 0;
        double tmp = 1;
        for (double ints : arr) {
            if (ints % 2 == 0) {
                tmp *= ints;
                counter++;
            }
        }
        if (counter != 0)
            return Math.pow(tmp, 1 / counter);
        else
            throw new IllegalArgumentException("no even");
    }
}
