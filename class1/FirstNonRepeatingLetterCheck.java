// package class1;

// public class frist_non_repit_letter_check {
//     public static void main(String[] args) {
//          String str1="aabbbdcce";
//          String target="";
//          char[] a=str1.toCharArray();
//          for(int i=0;i<=str1.length()-1;i++){
//             if(str1.charAt(i)!=str1.charAt(i+1)){
//                 target= target+str1.charAt(i);
//                 break;

//             }
        
//          }
//          System.out.println(target);
//     }
   
        
// }

package class1;

public class FirstNonRepeatingLetterCheck {
    public static void main(String[] args) {

        String str1 = "aabbbdcce";
        char result = ' ';

        for (int i = 0; i < str1.length(); i++) {
            int count = 0;

            for (int j = 0; j < str1.length(); j++) {
                if (str1.charAt(i) == str1.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                result = str1.charAt(i);
                break;
            }
        }

        System.out.println(result);
    }
}