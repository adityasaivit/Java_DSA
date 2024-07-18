import java.util.*;
public class Inputs {
    
    // use of the SCANNER CLASS to take inputs in java
    public static void main(String argd[])
    {
        Scanner scan=new Scanner(System.in);

        // int i =scan.nextInt();

        // System.out.println(i);
        // to take input of the integers

        // String word=scan.next();
        // System.out.println(word);
        // for the single word strings

        // char c=scan.next().charAt(0);
        // System.out.println(c);
        // for charecters

        // to take the input of complete name/string with spaces

        String completename=scan.nextLine();
        System.out.println(completename);


        // floatign input

        float f=scan.nextFloat();
        System.out.println(f);

        // double input

        double d=scan.nextDouble();
        System.out.println(d);

        // for the boolean
        boolean b=scan.nextBoolean();
        System.out.println(b);
        

    }
}
