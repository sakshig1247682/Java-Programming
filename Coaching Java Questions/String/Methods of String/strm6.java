public class strm6 {
    int age;
    String name;
    strm6(int a,String n){
        age=a;
        name=n;
    }
    public String toString(){
        return "My name is "+name+" and my age is "+age;
    }
    public static void main(String[] args) {
       strm6 str=new strm6(19,"Sakshi") ;
       System.out.println(str.toString());

    }
}
