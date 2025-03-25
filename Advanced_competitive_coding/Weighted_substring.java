import java.util.*;

public class Weighted_substring 
{
    public static int distinctsubstring(String p, String q, int k, int n) 
    {
        // HashSet to store all substrings
        HashSet<String> S = new HashSet<String>();
        for (int i = 0; i < n; i++) 
        {
            int sum = 0;
            String s = "";
            for (int j = i; j < n; j++) 
            {
                int pos = p.charAt(j) - 'a';
                sum += q.charAt(pos) - '0';
                s += p.charAt(j);
                if (sum <= k) 
                {
                    S.add(s);
                } 
                else 
                {
                    break;
                }
            }
        }
        // Return the count of distinct substrings
        return S.size();
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String p = sc.nextLine().toLowerCase(); 
        String q = "12345678912345678912345678";
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        int n = p.length();
        System.out.print(distinctsubstring(p, q, k, n));
    }
}
