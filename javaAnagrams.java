import java.util.Scanner;

public class javaAnagrams {
    static boolean isAnagram(String a, String b) {
        
        if(a.length()!=b.length()) return false;
      char aArr[]=new a.toCharArray();
      char bArr[]=new b.toCharArray();
      
        
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
