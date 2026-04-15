package class3;
//WAP TO rewERSE A x
public class Q2_using_recursion {
    static int rew=0;
    static int rewerse(int x){
        if(x==0){
            return rew ;

        }
        rew = rew * 10 + x% 10; // add last digit to rewersed xber
        return rewerse(x/10, rew);
    }
    
    public static void main(String[] args) {
        int x=12345;
        
    }
    
}
