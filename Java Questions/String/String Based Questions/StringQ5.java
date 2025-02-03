//Develop a Java program to remove duplicates from a given string.
class StringQ5{
public static String remove(String str){
 StringBuilder sb=new StringBuilder();
 for(int i=0;i<str.length();i++){
    char currchar=str.charAt(i);
    if(sb.indexOf(str.valueOf(currchar))==-1){
        sb.append(currchar);
    }
 }
       return sb.toString();
    }
public static void main(String[] args) {
    String input = "hello";
        System.out.println("Original String: " + input);
        String result = remove(input);
        System.out.println("String after removing duplicate words: " + result);
}
}
