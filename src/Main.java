import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            int n = Integer.parseInt(reader.readLine());//опредилитель матрицы
            int k = Integer.parseInt(reader.readLine());//номер для обработки матрицы по заданию

            if(n<2 || 0>=k ||  k>n)
            {
                System.err.println("Первое число должно быть не меньше 2.");
                System.err.println("Второе число должно быть положительным, но не больше первого!");
            }
            else
                Answer.calk(MatrixCreate.create(n), n);
        }
        catch (NumberFormatException e)
        {
            System.err.println("Enter number, \"enter\" and number ");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
