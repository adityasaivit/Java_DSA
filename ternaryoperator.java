import java.util.*;

public class ternaryoperator {
    

    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        // lets check if a student will pass or fail


        int a=4;
        System.out.println((a%2==0)? "even":"odd");

        int marks=scan.nextInt();
        String res=(marks>=33)? "Pass":"Fail";
        System.out.println("The result of the exam is "+res);
    }
}
