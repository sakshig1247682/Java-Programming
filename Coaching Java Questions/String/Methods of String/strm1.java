import java.util.Scanner;
public class strm1 {
    public static void main(String[] args) {
        String s=new String("sakshi gupta");
        System.out.println(s.isBlank());
        System.out.println(s.isEmpty());
        System.out.println(s.length());
        System.out.println(s.charAt(10));  
       String s1=new String("sakshi gupta");
        String s2=new String("Subh Rawat");
    System.out.println(s1.equals(s2));
    System.out.println(s1.contentEquals(s2));
    System.out.println(s1.equalsIgnoreCase(s2));
    System.out.println(s1.startsWith("s"));
     System.out.println(s1.endsWith("a"));
     System.out.println(s1.indexOf("a"));
     System.out.println(s1.lastIndexOf("a"));
     System.out.println(s1.substring(3,11));
    }
}
