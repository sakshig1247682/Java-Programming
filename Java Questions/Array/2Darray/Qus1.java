//To fin minimum and maximum number in 2D array!
public class Qus1 {
    public static void main(String[] args) {
        int arr[][]={{10,2},{100,30},{20,50}};
        int smallest=arr[0][0];
        int max=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
                if(arr[i][j]<smallest){
                    smallest=arr[i][j];
                }
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
            System.out.println(" ");
        }
        System.out.println("The smallest number is :"+smallest);
        System.out.println("The largest number is :"+max);
        
    }
}
