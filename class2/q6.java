package class2;

public class q6 {
    public static void main(String[] args) {
        String s1="123j54";
        String s2="gou5rav";
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)>= '0'&&s1.charAt(i)<='9'){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }

        }
        for(int i=0;i<s2.length();i++){
            if(s2.charAt(i)>= '0'&&s2.charAt(i)<='9'){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }

        }
    }
    
}
