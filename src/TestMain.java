/**
 * Клас для перевірки працездатності методу sumMatrix з класу Main.
 */
public class TestMain {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int result = Main.sumMatrix(matrix);
        System.out.println("Сума елементів: " + result);
    }
}