package class2;

public class string_q4 {
    public static void main(String[] args) {
        String str1="aabbbbcccccceedd";
        String str2="";
        str2=str2+str1.charAt(0);
        for(int i=1;i<str1.length();i++){
            if(str1.charAt(i)!=str1.charAt(i-1)){
                str2=str2+str1.charAt(i);
            }
        }
        System.out.println(str2);


    }
  
    
}
