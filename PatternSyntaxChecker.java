import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.Scanner;

public class PatternSyntaxChecker {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        input.nextLine();
        String s;
        for(int i=0;i<n;i++)
        {
            s=input.nextLine();
            try{
              Pattern.compile(s);
              System.out.println("Valid");
            }
            catch(Exception e)
            {
                System.out.println("Invalid");
            }
            
        
        }
    }
}
