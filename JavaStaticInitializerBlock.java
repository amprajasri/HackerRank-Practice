import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaStaticInitializerBlock {

   static Scanner input=new Scanner(System.in);
   static boolean flag;
   static int B;
   static int H;
   static
   {
        B=input.nextInt();
        H=input.nextInt();
        if(B<=0 || H<=0) flag=false;
        else flag=true;
        if(!flag)
        {
        
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
       
        }
   




public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}

}

