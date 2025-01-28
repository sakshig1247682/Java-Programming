public class whilel {   
    public static void main(String []args)  {
int i=56784;
int sum=0;
while(i>0){
    int mod=i%10;
    sum+=mod;
    i=i/10;
}
System.out.println(sum);
  }
}
