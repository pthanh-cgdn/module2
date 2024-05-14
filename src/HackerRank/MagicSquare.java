package HackerRank;

//public class MagicSquare {
//    byte[][] matrix;
//    public MagicSquare(byte[][] matrix){
//        this.matrix = matrix;
//    }
//    public static byte[][] getMagicSquare(byte[][] matrix){
//        byte[][] newMatrix = new byte[matrix.length][matrix[0].length];
//        newMatrix[1][1] = 5;
//
//    }

class MathUtil {
    public static int add(int a, int b) {
        return a + b;
    }
}

class Calculator extends MathUtil {
    public static int multiply(int a, int b) {
        return a * b;
    }

    // This hides the add method from MathUtil
    public static int addNew(int a, int b) {
        return add(a,b);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println(add(a,b));
    }
}
