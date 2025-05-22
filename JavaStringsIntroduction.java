import java.io.*;
import java.util.*;

public class JavaStringsIntroduction {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int i=A.compareTo(B);
        String s;
        if(i>0) s="Yes";
        else s="No";
        String a=Character.toUpperCase(A.charAt(0))+A.substring(1);
        String b=Character.toUpperCase(B.charAt(0))+B.substring(1);
        System.out.println((A.length()+B.length()));
        System.out.println(s);
        System.out.println(a+" "+b);
        
    }
}



