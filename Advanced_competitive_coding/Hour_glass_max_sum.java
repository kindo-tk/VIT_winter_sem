/**]
 * Maximum Hour glass sum in a 2D array
 * This program is to find the maximum sum of an hourglass shape 2d array
 * shape eg:
 *          a b c
 *            d
 *          e f g
 * The program iterates through all possible combination of hour glass and find their sum
 * and returns the maximum sum of the hourglass.
 */
import java.util.*;
public  class Hour_glass_max_sum
{
    public static int max_sum(int arr[][], int row, int col)
    {
        if (row<3 || col<3)
        {
            System.out.println("Rows and columns must be at least 3");
            return -1;
        }
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0;i<row-2;i++)
        {
            for (int j = 0;j<col-2;j++)
            {
                int sum = (arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]);
                max_sum = Math.max(max_sum,sum);
            }
            
        }
        return max_sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns:");
        int col = sc.nextInt();
        int [][] mat = new int[row][col];
        System.out.println("Enter the matrix:");
        for(int i = 0;i<row;i++)
        {
            for(int j = 0;j<col;j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }
        int result = max_sum(mat, row, col);
        if(result != -1)
        {
            System.out.println("Maximum sum of hour glass is:"+result);
        }
    }
}