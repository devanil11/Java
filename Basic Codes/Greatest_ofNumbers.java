import java.util.Scanner;
public class Greatest_ofNumbers {
    public static void main (String[]args)
    {
        int input1;
        int input2;

        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter First number to be print");
        input1= Sc.nextInt();
        System.out.println("Enter Second number to be print");
        input2=Sc.nextInt();

        if(input1>input2)
        {
            System.out.println("The Enter first number is greater than "+input2);
        }
        else
            System.out.println("The Enter Second number is greater than  "+input1);


    }


}
