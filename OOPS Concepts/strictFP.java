class A{
    public strictfp void add(){
        System.out.println(23.56789765f+45.67878787f);
    }
}


public class strictFP {
    public static void main(String[] args){
        A a = new A();
        a.add();

    }
}