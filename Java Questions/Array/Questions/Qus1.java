//Create an array of 5 float elements and find their sum

public class Qus1 {
    public static void main(String[] args) {
        float arr[]={1.2f,3.4f,4.4f,5.5f,7.0f};
        float sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("The sum is: "+sum);

    }
}
