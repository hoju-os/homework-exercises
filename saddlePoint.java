public class min extends Thread
{
    int[][] matrix;
    int[] array;
    min(int [] array)
    {
        super();
        this.array = array;

    }
    min(int[][] matrix)
    {
        super();
        this.matrix = matrix;
    }
    /* public void run()
    {
        rowMin(matrix);
    }
    */
    public void run ()
    {
        System.out.println(getMinValue(array));
    }
    public static void rowMin(int[][] matrix)

    {
        for(int i = 0; i < matrix.length; i++)
        {
            int minRow = matrix[i][0];
            int colIndex = 0;
            for(int j = 1; j < matrix[0].length; j++)
            {
                if(matrix[i][j] < minRow)
                {
                    minRow = matrix[i][j];
                    colIndex = j;
                }
            }
            System.out.println("Row_" + (i+1) + " Minimum:\t" + minRow);
        }
    }

    public static int getMinValue(int[] numbers)
    {
        int minValue = numbers[0];
        for(int i=1;i<numbers.length;i++)
        {
            if(numbers[i] < minValue)
            {
                minValue = numbers[i];
            }
        }
        return minValue;
    };

    public static void printMatrix(int[][] matrix)
    {
        for(int i = 0; i < matrix.length; i++)
        {
            int[] row = matrix[i];
            for (int j = 0; j < row.length; j++)
            {
                System.out.print(row[j] + "\t");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args)
    {
        int[][]matrix=new int[][] {	{10,20,3},
                {4,5,6},
                {7,8,9}};

        System.out.println("Matrix M\n");
        printMatrix(matrix);

        for(int i = 0; i < matrix.length; i++)
        {
            int [] array = matrix[i];
            min thread = new min(array);
            thread.start();
        }
    }
}
