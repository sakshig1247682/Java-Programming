public class firstmethod {
    //non-parameterized method
    public void test(){
        System.out.println("Sakshi Gupta");
    }
    //non-parameterized method
    public void calculate(){
        int num1=10;
        int num2=40;
        System.out.println(num1+num2);
    }
    //non-parameterized method
    public void findmax(){
        int num1=20;
        int num2=60;
    if(num1>num2){


        System.out.println(num1);
    }
      else{
        System.out.println(num2);

      }  
     }
    //non-parameterized method
     public void evennumber(){
        int num=33;
        if(num%2==0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");

        }
     }
    //parameterized method
     public void sum(int num1,int num2){
        int num3=num1+num2;
        System.out.println(num3);
     }
     public void evenoddnumber(int num1){
        if(num1%2==0){
            System.out.println("Given number is even");
        }
        else{
    System.out.println("Given number is odd");
       
        }
     }
     
     //parameterized with return type
     
     public int cal1(int num1,int num2){
        return num1+num2;
     }
     public static int cal2(int num1,int num2){
        return num1+num2;
     }
    public static void main(String[] args){
firstmethod t= new  firstmethod();
         t.test();
        t.calculate();
        t.findmax();
        t.evennumber();
        t.sum (23,44);
        t.evenoddnumber(77);
        int result=t.cal1(22,44);
        System.out.println(result);
        if (result%2==0){
            System.out.println("number is even");
        }
        // System.out.println(t.cal1(22, 33));
       System.out.println( firstmethod.cal2(44,22));
    }
}
