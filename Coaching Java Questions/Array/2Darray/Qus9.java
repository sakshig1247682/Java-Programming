import java.util.ArrayList;
import java.util.Arrays;

public class Qus9 {
   public static void main(String[] args) {
    int arr[]={1,2,3,4,5};
    ArrayList<int[]>al=new ArrayList<>();
    for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
            int[]sumarray=Arrays.copyOfRange(arr, i, j+1);
            al.add(sumarray);
        }
    }
    
    for(int i=0;i<al.size();i++){
        System.out.println(Arrays.toString(al.get(i)));
    }
   }
}


