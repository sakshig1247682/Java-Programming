//Write a program to check given integer is present or not in array!
public class Qus2 {
    public static void main(String[] args) {
        int arr[]={12,13,14,15,17,18,10};
        int find=13;
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
               if(find==arr[i]){
                 flag=true;
                 break;
               }
            }
            if(flag){
                System.out.println("the element is present in the array");
            }
       else   {
    System.out.println("The element is not present in the array");
          }
}
}