
class MinLinear{
    public static void main(String[] args) {
        int[] arr={ 10,18,-7,200,90,2000,24,65};
        System.out.println(min(arr));
    }

    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
    
}