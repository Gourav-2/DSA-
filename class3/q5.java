package class3;
//WAP TO FING Gcd(greatest common difser)
public class q5 {
    static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        System.out.println(gcd(12,18));
        
    }
    
}
