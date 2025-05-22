import java.io.*;
import java.util.*;
import java.util.Scanner;
public class JavaStringTokens {

    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      String s=input.nextLine();
      String[] arr=s.trim().split("[.?_\\s@!',]+");
      if(s.trim().isEmpty()){
        System.out.println(0);
      }else{
        System.out.println(arr.length);
       for(int i=0;i<arr.length;i++)
       {
        System.out.println(arr[i]);
       }
      }
      
    }
}
