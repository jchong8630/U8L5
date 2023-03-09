import java.util.Arrays;

public class EncryptorTester
{
    public static void main(String[] args) {
        // --------------------------------
        // ---- TEST PART A: fillBlock ----
        // --------------------------------
        Encryptor e = new Encryptor(2, 3);
        System.out.println(e.encryptMessage("This is confidential! Be on the lookout!"));
    }
    public static void print2DArray(String[][] arr)
    {
        for (String[] row : arr)
        {
            for (String val : row)
            {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static boolean testArr(String[][] expected, String[][] actual)
    {
        if (expected.length != actual.length)
        {
            return false;
        }

        if (expected[0].length != actual[0].length)
        {
            return false;
        }

        for (int row = 0; row < expected.length; row++)
        {
            for (int col = 0; col < expected[0].length; col++)
            {
                String expElement = expected[row][col];
                String actElement = actual[row][col];
                if (!expElement.equals(actElement))
                {
                    return false;
                }
            }
        }
        return true;
    }
}