import java.util.Random;

public class MatrixCreate {
    static int[][] create(int n) {
        int [][] matrix = new int[n][n];

        for(int y = 0; y<n; y++)
        {
            for(int x = 0; x<n; x++)
            {
                matrix[y][x] = new Random().nextInt(n*2+1)-n;
            }
        }

        for(int y = 0; y<n; y++)
        {
            for(int x = 0; x<n; x++)
            {
                if(matrix[y][x] < 0)
                    System.out.print("["+matrix[y][x] + "] ");
                else
                    System.out.print("[ "+matrix[y][x] + "] ");
            }
            System.out.println();
        }
        System.out.println();
        return matrix;
    }
}
