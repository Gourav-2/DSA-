package class3;

public class q7 {
    static int sum_in_array(int [] arr, int i){
        if(i==arr.length) return 0;
        return arr[i]+sum_in_array(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int i=0;
        System.out.println(sum_in_array(arr, 0));
        
    }
    
}
