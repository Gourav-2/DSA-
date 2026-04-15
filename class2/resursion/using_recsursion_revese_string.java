package class2.resursion;

public class using_recsursion_revese_string {
    static String rew(String n){
        return n.charAt(n.length()-1)+rew(n);
    }

    
    public static void main(String[] args) {
        System.out.println(rew("gourav"));
        
    }
    
}
