public class LinearStringSearch{
    public static void main(String[] args) {
        String str = "kunal";
        int target = 'p';
        System.err.println(LinearSearch(str, target));
        
    }
    static boolean LinearSearch (String str, int target){
        if(str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)){
                return true;

            }
        }
        return false;
    }
}
