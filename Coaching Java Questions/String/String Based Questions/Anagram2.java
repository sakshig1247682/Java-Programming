import java.util.Arrays;

public class Anagram2 {
    public static void main(String[] args) {
        boolean status=false;
        String s1 = "listen";
        String s2="silent";
        if(s1.length()!=s2.length()){
            status=false;
        }
        else{
            char[] first = s1.toLowerCase().toCharArray();
            char[] second = s2.toLowerCase().toCharArray();
            Arrays.sort(first);
            Arrays.sort(second);
            boolean result=Arrays.equals(first,second);
            status=result;
        }
        if(status==true){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    }
}
