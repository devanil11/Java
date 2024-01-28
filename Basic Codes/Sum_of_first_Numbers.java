import javax.xml.transform.Result;
import java.util.Scanner;
public class Sum_of_first_Numbers {
    public static void main(String[]args)
    {
        int input;
        int  sum=0;
        System.out.print("Enter number to be print of sum of all natural number:-  ");

        Scanner sc= new Scanner(System.in);
        input=sc.nextInt();
        for(int i=1; i<=input; i++) {
            sum += i;

        }
        System.out.println (sum);
    }

}
