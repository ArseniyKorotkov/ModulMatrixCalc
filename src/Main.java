import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            int n = Integer.parseInt(reader.readLine());//опредилитель матрицы

            if(n<2)
            {
                System.err.println("Enter number > 2");
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
