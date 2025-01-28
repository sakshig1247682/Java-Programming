import java.util.Arrays;
public class strm {
    public static void main(String[] args) {
        String s1=new String("sakshi gupta");
  System.out.println(s1.replace("a", "g"));
  System.out.println(s1.replaceAll("sakshi", "subh"));
  System.out.println(s1.replaceFirst("s", "d"));
  System.out.println(s1.contains("sak"));
  String data[]=s1.split("a");
      for(String str:data){
         System.out.println(str);
         System.out.println((Arrays.toString(data)));
      }
    }

}
