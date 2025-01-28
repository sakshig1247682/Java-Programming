public class methodSignature {
     public static int addme(int x,int y){
        return x+y;
     }
     public static float addme(int x, float y){
        return x+y;
     }
    public static void main(String[] args) {
    methodSignature.addme(12,12 );
    methodSignature.addme(12,12.5f);
    System.out.println(addme(12,12));
    System.out.println(addme(12,12.5f));

    }
}
