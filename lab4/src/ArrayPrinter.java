public class ArrayPrinter {
    static String arrToString(double[] arr){
        StringBuilder str = new StringBuilder();
        for(double ints : arr){
            str.append(ints).append(" ");
        }
        return str.toString();
    }
}
