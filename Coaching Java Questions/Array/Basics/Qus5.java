public class Qus5 {
    public static void main(String[] args) {
        //Three main ways to declare an  array!
        // int arr[]=new int [3];//declaration and memory allocation
        // arr[0]=11;
        // arr[1]=12;
        // arr[2]=33;
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
        // int arr1[];//declaration 
        // arr1=new int[3];//then memory allocation
        // arr1[0]=11;
        //  arr1[1]=12;
        //  arr1[2]=33;
        //  for (int i=0;i<arr1.length;i++){
        //     System.out.println(arr1[i]);
        //  }
        // int arr2 []={1,2,3};//declaration and initialization
        // for(int show:arr2){
        //     System.out.println(show);
        // }

        //print reverse elements of array!
        int arr[]={1,2,3,4,5,6};
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
