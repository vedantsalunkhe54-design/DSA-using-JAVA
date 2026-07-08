class Ranger{
    public static void main(String[] args) {
        int[] arr = {10, 24, 45, 12, 523};
        int target = 12;

        System.out.println(LinearSearch(arr, target, 2, 5));
    }

    static int LinearSearch(int[] arr, int target, int start, int end){
        if( arr.length == 0){
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}