import java.util.Scanner;

public class SumMinorDiagonal {
    public static void sumMinor(int[][] array,int row)
    {
        int i=0,j=row-1,sum=0;
        while(i<row && j>=0)
        {
            sum+=array[i][j];
            i++;
            j--;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int[][] array = new int[row][row];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<row;j++)
            {
                array[i][j]= scanner.nextInt();
            }
        }
        sumMinor(array,row);
    }
}
