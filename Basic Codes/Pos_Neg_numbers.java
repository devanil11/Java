import java.util.Scanner;

public class Pos_Neg_numbers {
    public static void main (String[]args )
    { //The no checked here positive or negative
        int input;
        System.out.println("Enter Number to be Chechked:- ");
        Scanner Sc= new Scanner(System.in);
        input= Sc.nextInt();

        if(input>0){
            System.out.println("The enter number is Positve:-\t"+input);
        }
        else
        {
            System.out.println("The Enter number is Negative:- \t"+input);
        }
    }
}
