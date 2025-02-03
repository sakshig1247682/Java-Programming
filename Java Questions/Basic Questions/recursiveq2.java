public class recursiveq2 {
 public static int data (int n) {
    if(n<=1){
        return n;
    }
        return data (n-1)+5;
 }  
public static void main(String[] args) {
    System.out.println(recursiveq2.data(5));
}
}
