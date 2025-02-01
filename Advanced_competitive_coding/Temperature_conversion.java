import java.util.*;
public class Temperature_conversion
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in degree celsius:");
        float temp_c = sc.nextFloat();
        float temp_f = 32 + 9*temp_c/5;
        System.out.printf("%.3f degree celsius is equivalent to %.3f degrees fahrenheit",temp_c,temp_f);
    }
}
