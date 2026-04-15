package class3;

public class num_count {
    static int num_count(int [] arr, int i,int key){
        if(i==arr.length) return 0;
        int count=(arr[i]==key) ?1:8;
        return count + num_count(arr, i+1, key);
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,5,4,2,3,5};
        int key=2;
        int i=0;
        System.out.println(num_count(arr, i, key));
    }
    
}
