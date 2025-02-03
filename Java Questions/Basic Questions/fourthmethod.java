public class fourthmethod {

public static int printnumber (int n){
    if(n==5){
        return n;
    }
    System.out.println(n);
  return printnumber(n+1);
}
    public static void main(String[] args){
System.out.println(printnumber(0));
    }  
}
