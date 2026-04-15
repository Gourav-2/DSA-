package class1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class check_anagram {
    public static void main(String[] args) {
        String str1="silent";
        String str2="listen";

        char[] a= str1.toCharArray();//this method string convert into arry
        char[] b=str2.toCharArray();
        
        Arrays.sort(a);//this method sort arrys
        Arrays.sort(b);//this method sort arrys

        if(Arrays.equals(a, b)){
            System.out.println("String is anagram");
        }
        else{
            System.out.println("string is not anagram");
        }

        

    }
    
}
