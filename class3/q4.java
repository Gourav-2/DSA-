package class3;
// WAP TO COUNT DIGIT NUM USING RECURSION 
public class q4 {
    static int count_of_num(int n){
        if(n==0){
            return 0;
        }
        return 1 + count_of_num(n/10);
    }

    public static void main(String[] args) {
        int num=123545644;
        System.out.println(count_of_num(num));

        
    }
    
}
