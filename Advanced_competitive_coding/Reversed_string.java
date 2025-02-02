import java.util.*;
public class Reversed_string 
{
    public static void main(String[] args)
    {
        String word = "Tufan";
        String rev = "";
        for (int i = word.length()-1;i>=0;i--)
        {
            rev+=word.charAt(i);
        }
        System.out.println(word);
        System.out.println(rev);

    }    
}
