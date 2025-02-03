public class stringQ3 {
    public static void main(String[] args) {
        String s="car is fast";
        String str[]=s.split("\\s");
        StringBuilder sb=new StringBuilder();
        for(String word:str){
            for(int i=word.length()-1;i>=0;i--){
                sb.append(word.charAt(i));
            }
            sb.append(" ");
        }
        System.out.println(sb);
    }
}
