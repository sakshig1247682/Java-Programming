public class StringQ1 {
    public static void main(String[] args) {
        String str="aaabbcc";
        StringBuilder sb=new StringBuilder();
        char curchar=str.charAt(0);
        int count=1;
        for(int i=1; i<str.length();i++){
     char nextchar=str.charAt(i);
     if(nextchar==curchar){
     count++;
    }
        else{
            sb.append(curchar);
            sb.append(count);
            curchar=nextchar;
            count=1;
        }
    }  

     sb.append(curchar);
     sb.append(count);
    System.out.println(sb);
    }
}
   

