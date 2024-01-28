import java.util.Scanner;
public class Even_odd_chekced {
    public static void main(String[]args)
    {
        int input;
        System.out.println("Enter the number:-\t");
        Scanner Sc= new Scanner(System.in);
        input = Sc.nextInt();

        if(input%2==0)
        {
            System.out.println("The enter number is even:- "+input);
        }
            else {
            System.out.println("The enter number is odd:-"+input);
        }


    }

}
