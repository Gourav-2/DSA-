package class1;

public class check_palendrom {
     public static void main(String[] args) {
        String str1="nitin";
        String rew="";
        for(int i=str1.length()-1;i>=0;i--){
            rew = rew+str1.charAt(i);
        }
        if(str1.equals(rew)){
            System.out.println("string is palendrom");
        }
        else{
            System.out.println("no palendrom");
        }

    }
    
}
