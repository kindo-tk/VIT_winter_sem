/**
 * Given a string, move all the hyphens to the beginning of the string.
 */
import java.util.*;
public class move_hyphen_to_beginning 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.print("After moving hyphens to the beginning: ");
        System.out.println(moveHyphen(str));
    }

    public static String moveHyphen(String str) 
    {
        char arr[] = str.toCharArray();
        int i = arr.length -1;
        for (int j = i;j>=0;j--)
        {
            if(arr[j]!='-')
            {
                char c = arr[i];
                arr[i] = arr[j];
                arr[j] = c;
                i--;
            }
        }
        return new String(arr);
    }
}