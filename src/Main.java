import java.util.Arrays;

/**
 * Клас містить метод для обчислення суми всіх елементів двовимірної матриці.
 */
public class Main {
    /**
     * Обчислює суму всіх елементів прямокутної матриці.
     * @param matrix двовимірний масив цілих чисел
     * @return сума всіх елементів
     */
    public static int sumMatrix(int[][] matrix) {
        return Arrays.stream(matrix)
                     .flatMapToInt(Arrays::stream)
                     .sum();
    }
}