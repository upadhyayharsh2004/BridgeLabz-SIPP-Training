import java.util.*;
public class Question4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        int[] array = new int[rows * cols];

        System.out.println("Enter matrix values:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = sc.nextInt();

        int index = 0;
        for (int[] row : matrix)
            for (int val : row)
                array[index++] = val;

        System.out.println("1D Array:");
        for (int val : array)
            System.out.print(val + " ");
    }
}