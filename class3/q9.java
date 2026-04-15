package class3;
//WAP TO CHECK NUM IS PRESENT IN ARRAY
public class q9 {
      static boolean count(int []arr,int i,int key){
        if(i==arr.length) return false;
        if(arr[i]==key) return true;
        return count(arr, i+1, key);
      }
    public static void main(String[] args) {
        int arr[]={1,2,2,5,4,2,3,5};
        int key=6;
        int i=0;
        System.out.println(count(arr, i, key));
    
    
}
}
